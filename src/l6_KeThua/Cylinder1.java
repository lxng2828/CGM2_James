package l6_KeThua;

public class Cylinder1 extends Circle1 {
    private double height;

    public Cylinder1() {
        super();
        this.height = 1.0;
    }

    public Cylinder1(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("hinh tru co ban kinh %.2f, mau %s, chieu cao %.2f]", radius, color, height);
    }

}
