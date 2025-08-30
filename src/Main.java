import course.Module;
import course.module.Coursework;

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
        Module introductionToObjectOrientedProgramming = new Module(
                15,
                new Coursework(15,
                        "Class Definition (Programming) (Approx. 16 hours)",
                        "Assignment",
                        100
                ),
                "Introduction to Object-Oriented Programming",
                1
        );
    }
}