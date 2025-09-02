package course;

import course.module.Coursework;
import java.util.ArrayList;

/**
 * Represents a module in a course with details such as credit value, coursework, name, stage, and exam.
 */
public class Module {
    private int creditValue;

    private final ArrayList<Coursework> coursework;
    private String name;
    private int stage;

    /**
     * Constructs a Module without the exam attribute.
     *
     * @param creditValue The credit value of the module.
     * @param name        The name of the module.
     * @param stage       The stage or level of the module.
     */
    public Module(String name, int creditValue, int stage) {
        this.coursework = new ArrayList<>();
        this.creditValue = creditValue;
        this.stage = stage;
        this.name = name;
    }

    /**
     * Gets the credit value of the module.
     *
     * @return The credit value.
     */
    public int getCreditValue() {
        return this.creditValue;
    }

    /**
     * Retrieves the list of coursework associated with the module.
     *
     * @return An `ArrayList` containing the coursework.
     */
    public ArrayList<Coursework> getCoursework() {
        return this.coursework;
    }

    /**
     * Sets the credit value of the module.
     *
     * @param creditValue The credit value to set.
     */
    public void setCreditValue(int creditValue) {
        this.creditValue = creditValue;
    }

    /**
     * Sets the coursework percentage of the module.
     *
     * @param coursework The coursework percentage to set.
     */
    public void addCoursework(Coursework coursework) {
        this.coursework.add(coursework);
    }

    /**
     * Gets the name of the module.
     *
     * @return The name of the module.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the module.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = this.name;
    }

    /**
     * Gets the stage or level of the module.
     *
     * @return The stage of the module.
     */
    public int getStage() {
        return this.stage;
    }

    /**
     * Sets the stage or level of the module.
     *
     * @param stage The stage to set.
     */
    public void setStage(int stage) {
        this.stage = stage;
    }

    /**
     * Prints the details of all coursework associated with the module.
     * Each coursework details are displayed in a formatted manner.
     */
    public void printCourseworkDetails() {
        System.out.println(this.getName() + " Coursework Details:");
        for (Coursework coursework : this.coursework) {
            System.out.println(coursework.toString());
        }
    }
}