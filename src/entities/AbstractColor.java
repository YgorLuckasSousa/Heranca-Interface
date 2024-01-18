package entities;

public abstract class AbstractColor implements Shape {

    private String color1;

    public AbstractColor(String color1) {
        this.color1 = color1;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }
}
