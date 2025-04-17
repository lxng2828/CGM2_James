package l6_KeThua;

public class LopPoint2DvaLopPoint3D {
    public static void main(String[] args) {
        Point2D p2_1 = new Point2D();
        Point2D p2_2 = new Point2D(3.5f, -2.1f);

        System.out.println("Point P2_1: " + p2_1.toString());
        System.out.println("Point P2_2: " + p2_2);

        p2_1.setXY(1.0f, 1.0f);
        System.out.println("Point P2_1 after setting: " + p2_1);
        System.out.println("Y-coordinate of P2_2: " + p2_2.getY());

        float[] coords2D = p2_2.getXY();
        System.out.println("Array of coordinates of P2_2: [" + coords2D[0] + ", " + coords2D[1] + "]");

        Point3D p3_1 = new Point3D();
        Point3D p3_2 = new Point3D(1.0f, 2.5f, -0.5f);

        System.out.println("Point P3_1: " + p3_1);
        System.out.println("Point P3_2: " + p3_2);

        p3_1.setXYZ(5.0f, -5.0f, 10.0f);
        System.out.println("Point P3_1 after setting: " + p3_1);
        System.out.println("Z-coordinate of P3_2: " + p3_2.getZ());

        float[] coords3D = p3_2.getXYZ();
        System.out.println(
                "Array of coordinates of P3_2: [" + coords3D[0] + ", " + coords3D[1] + ", " + coords3D[2] + "]");

        Point2D p_ref = p3_2;
        System.out.println("P3_2 cast to Point2D: " + p_ref.toString());
    }
}
