package calculator;

import course.module.Coursework;
import java.util.ArrayList;

/**
 * The class for calculating grades based on coursework.
 */
public class Calculator {
    private final ArrayList<Coursework> coursework;
    private double finalMark = 0.0;

    /**
     * Constructs a Calculator object with the specified list of coursework.
     *
     * @param coursework The list of coursework to calculate grades for.
     */
    public Calculator(ArrayList<Coursework> coursework) {
        this.coursework = coursework;
    }

    /**
     * Calculates the final grade based on the marks and components of the coursework.
     */
    public void calculateGrade() {
        // Initialize the final mark to 0
        double finalMark = 0.0;

        // Iterate through each coursework in the list
        for (Coursework coursework : this.coursework) {
            // Get the component weight and mark for the coursework
            double component = coursework.getComponent();
            int mark = coursework.getMark();

            // Calculate the weighted contribution of the coursework to the final mark
            finalMark += mark * component / 100;
        }

        // Update the final mark for the calculator
        this.finalMark = finalMark;
    }

    /**
     * Prints and returns a summary of the coursework details and the final grade.
     *
     */
    public void printSummary() {
        // Create a StringBuilder to construct the summary string
        StringBuilder stringBuilder = new StringBuilder();

        // Iterate through each coursework and append its details to the StringBuilder
        for (Coursework coursework : this.coursework) {
            stringBuilder.append(String.format(
                    "%s: %s, Mark = %d, Component = %d%%\n",
                    coursework.getType(),
                    coursework.getTitle(),
                    coursework.getMark(),
                    coursework.getComponent()
            ));
        }

        // Append the final grade to the summary
        stringBuilder.append(String.format("\nFinal Grade: %.2f\n", this.finalMark));

        // Convert the StringBuilder content to a string and print the result
        String result = stringBuilder.toString();
        System.out.println(result);
    }
}