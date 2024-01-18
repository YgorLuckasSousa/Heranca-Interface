package entities;

public class Circle extends Shape{
    public Circle(String color1) {
        super(color1);
    }
    private Double radius;

    public Circle(String color1, Double radius) {
        super(color1);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }


    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
