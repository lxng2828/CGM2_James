package l7_AbstractClassAndInterface;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        this.filled = false;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        this.filled = false;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Circle with radius %.2f, color %s, filled %b",
                radius, color, filled);
    }

}
