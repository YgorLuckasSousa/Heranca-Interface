package entities;

public class Rectangle extends Shape{
    public Rectangle(String color1) {
        super(color1);
    }
    private Double width;
    private Double height;

    public Rectangle(String color1, Double width, Double height) {
        super(color1);
        this.width = width;
        this.height = height;
    }

    public Double area(){
        return width * height;
    }
}
