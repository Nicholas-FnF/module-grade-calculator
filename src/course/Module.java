package course;

import course.module.Coursework;

/**
 * Represents a module in a course with details such as credit value, coursework, name, stage, and exam.
 */
public class Module {
    private int creditValue;
    private Coursework coursework;
    private String name;
    private int stage;
    private int exam;

    /**
     * Constructs a Module with all attributes.
     *
     * @param creditValue The credit value of the module.
     * @param coursework  The coursework percentage of the module.
     * @param name        The name of the module.
     * @param stage       The stage or level of the module.
     * @param exam        The exam percentage of the module.
     */
    public Module(int creditValue, Coursework coursework, String name, int stage, int exam) {
        this.creditValue = creditValue;
        this.coursework = coursework;
        this.stage = stage;
        this.name = name;
        this.exam = exam;
    }

    /**
     * Constructs a Module without the exam attribute.
     *
     * @param creditValue The credit value of the module.
     * @param coursework  The coursework percentage of the module.
     * @param name        The name of the module.
     * @param stage       The stage or level of the module.
     */
    public Module(int creditValue, Coursework coursework, String name, int stage) {
        this.creditValue = creditValue;
        this.coursework = coursework;
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
     * Sets the credit value of the module.
     *
     * @param creditValue The credit value to set.
     */
    public void setCreditValue(int creditValue) {
        this.creditValue = creditValue;
    }

    /**
     * Gets the coursework percentage of the module.
     *
     * @return The coursework percentage.
     */
    public Coursework getCoursework() {
        return this.coursework;
    }

    /**
     * Sets the coursework percentage of the module.
     *
     * @param coursework The coursework percentage to set.
     */
    public void setCoursework(Coursework coursework) {
        this.coursework = coursework;
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
     * Gets the exam percentage of the module.
     *
     * @return The exam percentage.
     */
    public int getExam() {
        return this.exam;
    }

    /**
     * Sets the exam percentage of the module.
     *
     * @param exam The exam percentage to set.
     */
    public void setExam(int exam) {
        this.exam = exam;
    }
}