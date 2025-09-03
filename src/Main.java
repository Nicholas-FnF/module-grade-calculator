import calculator.Calculator;
import course.Module;
import course.module.Coursework;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.json.*;

/**
 * The entry point of the application.
 */
public class Main {

    /**
     * The main method serves as the starting point for the application.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        try (InputStream file = new FileInputStream("src/data.json");
             JsonReader reader = Json.createReader(file)) {
            JsonObject jsonObject = reader.readObject();

            JsonArray modules = jsonObject.getJsonArray("modules");
            ArrayList<Module> modulesArrayList = new ArrayList<>();


            for (JsonValue jsonValueModule : modules) {
                JsonObject moduleJsonObject = jsonValueModule.asJsonObject();

                int creditValue = moduleJsonObject.getInt("creditValue");
                String name = moduleJsonObject.getString("name");
                int stage = moduleJsonObject.getInt("stage");


                Module module = new Module(name, creditValue, stage);
                modulesArrayList.add(module);

                JsonArray courseworkJsonArray = moduleJsonObject.getJsonArray("coursework");

                for (JsonValue jsonValueCoursework : courseworkJsonArray) {
                    JsonObject courseworkJsonObject = jsonValueCoursework.asJsonObject();

                    int component = courseworkJsonObject.getInt("component");
                    String title = courseworkJsonObject.getString("title");
                    String type = courseworkJsonObject.getString("type");
                    int mark = courseworkJsonObject.getInt("mark");

                    Coursework coursework = new Coursework(component, title, type, mark);

                    module.addCoursework(coursework);
                }

                System.out.println("--------------------");

                System.out.println(module.getName() + " | " + "Stage: " + module.getStage() + " | Grade Summary:\n");
            }

            for (Module module : modulesArrayList) {
                Calculator calculator = new Calculator(module.getCoursework());
                calculator.calculateGrade();
                calculator.printSummary();
            }

        System.out.println("--------------------\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}