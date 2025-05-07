package l8_CleanCode.RefactoringTachPhuongThuc;

public class CylinderTest {

    public static void testGetVolumePositiveValues() {
        int radius = 3;
        int height = 5;
        double expected = 48 * Math.PI;
        double result = Cylinder.getVolume(radius, height);

        if (Math.abs(result - expected) < 0.000001) {
            System.out.println("Kiem thu getVolume (duong): Thanh cong");
        } else {
            System.out.println(
                    "Kiem thu getVolume (duong): That bai. Ket qua thuc te: " + result + ", Mong doi: " + expected);
        }
    }

    public static void testGetVolumeRadiusZero() {
        int radius = 0;
        int height = 10;
        double expected = 0.0;
        double result = Cylinder.getVolume(radius, height);

        if (Math.abs(result - expected) < 0.000001) {
            System.out.println("Kiem thu getVolume (ban kinh 0): Thanh cong");
        } else {
            System.out.println("Kiem thu getVolume (ban kinh 0): That bai. Ket qua thuc te: " + result + ", Mong doi: "
                    + expected);
        }
    }

    public static void testGetVolumeHeightZero() {
        int radius = 4;
        int height = 0;

        double expected = 32 * Math.PI;
        double result = Cylinder.getVolume(radius, height);

        if (Math.abs(result - expected) < 0.000001) {
            System.out.println("Kiem thu getVolume (chieu cao 0): Thanh cong");
        } else {
            System.out.println("Kiem thu getVolume (chieu cao 0): That bai. Ket qua thuc te: " + result + ", Mong doi: "
                    + expected);
        }
    }

    public static void runAllTests() {
        System.out.println("Bat dau kiem thu Cylinder...");
        testGetVolumePositiveValues();
        testGetVolumeRadiusZero();
        testGetVolumeHeightZero();
        System.out.println("Hoan thanh kiem thu Cylinder.");
    }
}