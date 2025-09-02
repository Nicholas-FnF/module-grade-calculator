import course.module.Coursework;
import calculator.Calculator;
import course.Module;

/**
 * The entry point of the application.
 */
public class ModuleGradeCalculator {

    /**
     * The main method serves as the starting point for the application.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        Module COMP3200 = new Module(
                "Introduction to Object-Oriented Programming",
                15,
                1
        );

        Coursework c1 = new Coursework(15,"Class Definition", "Assignment", 100);
        Coursework c2 = new Coursework(20, "Collections", "Assignment", 100);
        Coursework c3 = new Coursework(15, "Code Quality", "Assignment", 83);
        Coursework c4 = new Coursework(20, "Class Exercise", "Assignment", 100);
        Coursework c5 = new Coursework(30, "1.5 hour timed Assessment", "Test", 100);

        COMP3200.addCoursework(c1);
        COMP3200.addCoursework(c2);
        COMP3200.addCoursework(c3);
        COMP3200.addCoursework(c4);
        COMP3200.addCoursework(c5);

        Calculator calculator = new Calculator(COMP3200.getCoursework());
        calculator.calculateGrade();

        System.out.println("--------------------\n");
        System.out.println(COMP3200.getName() + " | " + "Stage: " + COMP3200.getStage() + " | Grade Summary:\n");
        calculator.printSummary();
        System.out.println("--------------------\n");
    }
}