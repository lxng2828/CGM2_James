package l6_KeThua;

public class ThetKeVaTrienKhaiLopTriangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle3 = new Triangle(3.0, 4.5, 2.0);

        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());
        System.out.println(triangle3.toString());

        System.out.println("Area of triangle1: " + triangle1.getArea());
        System.out.println("Area of triangle2: " + triangle2.getArea());
        System.out.println("Area of triangle3: " + triangle3.getArea());

        System.out.println("Perimeter of triangle1: " + triangle1.getPerimeter());
        System.out.println("Perimeter of triangle2: " + triangle2.getPerimeter());
        System.out.println("Perimeter of triangle3: " + triangle3.getPerimeter());

    }
}
