import course.module.Coursework;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.FileInputStream;
import calculator.Calculator;
import java.io.InputStream;
import java.util.ArrayList;
import course.Module;
import javax.json.*;

/**
 * The entry point of the application.
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    /**
     * The main method serves as the starting point for the application.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        // Open the JSON file and create a JSON reader
        try (InputStream file = new FileInputStream("src/data.json");
             JsonReader reader = Json.createReader(file)) {
            // Read the JSON object from the file
            JsonObject jsonObject = reader.readObject();

            // Extract the "modules" array from the JSON object
            JsonArray modules = jsonObject.getJsonArray("modules");
            ArrayList<Module> modulesArrayList = new ArrayList<>();

            // Iterate through each module in the JSON array
            for (JsonValue jsonValueModule : modules) {
                JsonObject moduleJsonObject = jsonValueModule.asJsonObject();

                // Extract module details
                String name = moduleJsonObject.getString("name");
                int stage = moduleJsonObject.getInt("stage");

                // Create a Module object and add it to the list
                Module module = new Module(name, stage);
                modulesArrayList.add(module);

                // Extract the "coursework" array for the module
                JsonArray courseworkJsonArray = moduleJsonObject.getJsonArray("coursework");

                // Iterate through each coursework in the JSON array
                for (JsonValue jsonValueCoursework : courseworkJsonArray) {
                    JsonObject courseworkJsonObject = jsonValueCoursework.asJsonObject();

                    // Extract coursework details
                    int component = courseworkJsonObject.getInt("component");
                    String title = courseworkJsonObject.getString("title");
                    String type = courseworkJsonObject.getString("type");
                    int mark = courseworkJsonObject.getInt("mark");

                    // Create a Coursework object and add it to the module
                    Coursework coursework = new Coursework(component, title, type, mark);
                    module.addCoursework(coursework);
                }
            }

            // Calculate and print the grade summary for each module
            for (Module module : modulesArrayList) {
                // Print a separator and the module heading summary
                System.out.println("--------------------\n");
                module.printModuleHeadingSummary();

                Calculator calculator = new Calculator(module.getCoursework());

                calculator.calculateGrade();
                calculator.printSummary();
            }

            // Print a final separator
            System.out.println("--------------------\n");

        } catch (Exception e) {
            // Handle any exceptions that occur
            logger.log(Level.SEVERE, "Something went wrong.");
        }
    }
}