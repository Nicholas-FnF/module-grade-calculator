package calculator;

import course.module.Coursework;
import java.util.ArrayList;

public class Calculator {
    private final ArrayList<Coursework> coursework;
    private double finalMark = 0.0;

    public Calculator(ArrayList<Coursework> coursework) {
        this.coursework = coursework;
    }

    public void calculateGrade() {
        double finalMark = 0.0;

        for (Coursework coursework : this.coursework) {
            double component = coursework.getComponent();
            int mark = coursework.getMark();

            finalMark += mark * component / 100;
        }

        this.finalMark = finalMark;
    }

    public String printSummary() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Coursework coursework : this.coursework) {
            stringBuilder.append(String.format(
                    "Module: %s (%s): Mark = %d, Component = %d%%\n",
                    coursework.getTitle(),
                    coursework.getType(),
                    coursework.getMark(),
                    coursework.getComponent()
            ));
        }

        stringBuilder.append(String.format("\nFinal Grade: %.2f\n", this.finalMark));

        String result = stringBuilder.toString();
        System.out.println(result);
        return result;
    }

}
