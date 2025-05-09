package l6_KeThua;

public class Circle1 {
    protected double radius;
    protected String color;

    public Circle1() {
        this.radius = 1.0;
        this.color = "do";
    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("hinh tron co ban kinh %.2f, mau %s]", radius, color);
    }
}
