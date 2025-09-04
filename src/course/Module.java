package course;

import course.module.Coursework;
import java.util.ArrayList;

/**
 * Represents a module in a course with details such as credit value, coursework, name, stage, and exam.
 */
public class Module {
    private final ArrayList<Coursework> coursework;
    private final String name;
    private final int stage;

    /**
     * Constructs a Module without the exam attribute.
     *
     * @param name        The name of the module.
     * @param stage       The stage or level of the module.
     */
    public Module(String name, int stage) {
        this.coursework = new ArrayList<>();
        this.stage = stage;
        this.name = name;
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
     * Gets the stage or level of the module.
     *
     * @return The stage of the module.
     */
    public int getStage() {
        return this.stage;
    }

    /**
     * Prints a summary of the module heading, including the name, stage, and a grade summary header.
     */
    public void printModuleHeadingSummary() {
        System.out.println(getName() + " | " + "Stage: " + getStage() + " | Grade Summary:\n");
    }
}