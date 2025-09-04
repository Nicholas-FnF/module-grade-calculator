package course.module;

/**
 * Represents a coursework component of a module, including details such as title, type, mark, and component weight.
 */
public class Coursework {
    private final int component;
    private final String title;
    private final int mark;
    private String type;

    /**
     * Constructs a Coursework object with the specified details.
     *
     * @param component The weight of the coursework as a percentage of the module.
     * @param title     The title of the coursework.
     * @param type      The type of the coursework (e.g., "Assignment" or "Test").
     * @param mark      The mark achieved in the coursework.
     */
    public Coursework(int component, String title, String type, int mark) {
        this.component = component;
        this.title = title;
        this.mark = mark;

        // Check if the type is valid (either "Assignment", "Test", "Coursework" or "Examination")
        if (!type.equalsIgnoreCase("assignment") &&
                !type.equalsIgnoreCase("test") &&
                !type.equalsIgnoreCase("examination") &&
                !type.equalsIgnoreCase("coursework")
        ) {
            // Print an error message if the type is invalid
            System.out.println("Type must either be 'Assignment', 'Test' or 'Examination'.");

            // Set the type to invalid
            this.type = "Invalid";
        } else {
            // Set the type if it is valid
            this.type = type;
        }
    }

    /**
     * Gets the component weight of the coursework.
     *
     * @return The component weight as a percentage.
     */
    public int getComponent() {
        return this.component;
    }

    /**
     * Gets the title of the coursework.
     *
     * @return The title of the coursework.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Gets the type of the coursework.
     *
     * @return The type of the coursework (e.g., "Assignment" or "Test").
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets the mark achieved in the coursework.
     *
     * @return The mark achieved.
     */
    public int getMark() {
        return this.mark;
    }

    /**
     * Returns a string representation of the coursework details.
     *
     * @return A formatted string containing the coursework details.
     */
    @Override
    public String toString() {
        return "-----\n" + "Title: " + getTitle() + "\n" + "Type: " + getType() + "\n" + "Mark: " + getMark() + "\n" + "Component: " + getComponent() + "\n" + "-----\n";
    }
}