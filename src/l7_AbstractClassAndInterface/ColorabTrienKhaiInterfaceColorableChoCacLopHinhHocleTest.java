package l7_AbstractClassAndInterface;

public class ColorabTrienKhaiInterfaceColorableChoCacLopHinhHocleTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle2(5.0, "blue", true);
        shapes[1] = new Rectangle(4.0, 6.0, "red", false);
        shapes[2] = new Square(5.0, "yellow", true);

        System.out.println("Processing shapes:");
        System.out.println("====================");

        for (Shape shape : shapes) {
            System.out.println("Object type: " + shape.getClass().getSimpleName());

            if (shape instanceof Square) {
                System.out.println("Area: " + ((Square) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Area: " + ((Rectangle) shape).getArea());
            } else if (shape instanceof Circle2) {
                System.out.println("Area: " + ((Circle2) shape).getArea());
            } else {
                System.out.println("Area: Not applicable for base Shape class.");
            }

            if (shape instanceof Colorable) {
                System.out.print("How to color: ");
                ((Colorable) shape).howToColor();
            } else {
                System.out.println("This shape is not Colorable.");
            }

            System.out.println("--------------------");
        }
    }
}