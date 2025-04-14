package l6_KeThua;

public class HeCacDoiTuongHinhHoc {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        Shape[] shapes2 = new Shape[2];
        shapes2[0] = new Circle(5.0, "do", false);
        shapes2[1] = new Rectangle(6.0,10.0,"tim",true);

        for (Shape shape : shapes2) {
            System.out.println(shape.toString());
        }
    }

}