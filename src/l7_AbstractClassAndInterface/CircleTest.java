package l7_AbstractClassAndInterface;

public class CircleTest {
    public static void main(String[] args) {
        Circle2 circle = new Circle2();
        System.out.println(circle);

        circle = new Circle2(3.5);
        System.out.println(circle);

        circle = new Circle2(3.5, "indigo", false);
        System.out.println(circle);
    }
}