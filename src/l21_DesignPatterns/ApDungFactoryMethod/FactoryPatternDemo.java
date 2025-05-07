package l21_DesignPatterns.ApDungFactoryMethod;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        System.out.println("--- Bat dau su dung ShapeFactory ---");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        if (shape1 != null) {
            System.out.print("Hinh duoc tao (yeu cau CIRCLE): ");
            shape1.draw();
        } else {
            System.out.println("Khong tao duoc hinh voi yeu cau CIRCLE.");
        }

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        if (shape2 != null) {
            System.out.print("Hinh duoc tao (yeu cau RECTANGLE): ");
            shape2.draw();
        } else {
            System.out.println("Khong tao duoc hinh voi yeu cau RECTANGLE.");
        }

        Shape shape3 = shapeFactory.getShape("SQUARE");
        if (shape3 != null) {
            System.out.print("Hinh duoc tao (yeu cau SQUARE): ");
            shape3.draw();
        } else {
            System.out.println("Khong tao duoc hinh voi yeu cau SQUARE.");
        }

        Shape shape4 = shapeFactory.getShape("TRIANGLE");
        if (shape4 != null) {
            System.out.print("Hinh duoc tao (yeu cau TRIANGLE): ");
            shape4.draw();
        } else {
            System.out.println("Khong tao duoc hinh voi yeu cau TRIANGLE (loai khong duoc ho tro).");
        }

        System.out.println("--- Ket thuc su dung ShapeFactory ---");
    }
}