package l6_KeThua;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return String.format(
                "Hinh chu nhat co chieu dai %.2f, dien tich %.2f, chu vi %.2f, %s",
                this.width,
                this.height,
                this.getArea(),
                this.getPerimeter(),
                super.toString().toLowerCase());
    }
}
