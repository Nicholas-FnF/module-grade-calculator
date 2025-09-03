package course.module;

/**
 * Represents a coursework component of a module, including details such as title, type, mark, and component weight.
 */
public class Coursework {
    private int component;
    private String title;
    private String type;
    private int mark;

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

        if (!type.equalsIgnoreCase("assignment") && !type.equalsIgnoreCase("test")) {
            System.out.println("Type must either be 'Assignment' or 'Test'");
        } else {
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
     * Sets the component weight of the coursework.
     *
     * @param component The component weight to set.
     */
    public void setComponent(int component) {
        this.component = component;
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
     * Sets the title of the coursework.
     *
     * @param title The title to set.
     */
    public void setTitle(String title) {
        this.title = title;
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
     * Sets the type of the coursework.
     *
     * @param type The type to set (e.g., "Assignment" or "Test").
     */
    public void setType(String type) {
        this.type = type;
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
     * Sets the mark achieved in the coursework.
     *
     * @param mark The mark to set.
     */
    public void setMark(int mark) {
        this.mark = mark;
    }

    /**
     * Returns a string representation of the coursework details.
     *
     * @return A formatted string containing the coursework details.
     */
    @Override
    public String toString() {
        return "-----\n" + "Title: " + this.getTitle() + "\n" + "Type: " + this.getType() + "\n" + "Mark: " + this.getMark() + "\n" + "Component: " + this.getComponent() + "\n" + "-----\n";
    }
}