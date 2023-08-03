public abstract class Shape implements Cloneable {

    private String id;
    protected String type;
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}