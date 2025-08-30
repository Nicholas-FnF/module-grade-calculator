package course.module;

public class Coursework {
    private int component;
    private String title;
    private String type;
    private int mark;

    public Coursework(int component, String title, String type, int mark) {
        this.component = component;
        this.title = title;
        this.type = type;
        this.mark = mark;
    }

    public int getComponent() {
        return this.component;
    }

    public void setComponent(int component) {
        this.component = component;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMark() {
        return this.mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
