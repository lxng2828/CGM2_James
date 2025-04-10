package l4_LopVaDoiTuongJava;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public void display() {
        System.out.println("Hinh chu nhat co chieu rong = " + width + " va chieu cao = " + height);
        System.out.println("Dien tich = " + getArea());
        System.out.println("Chu vi = " + getPerimeter());
    }
}
