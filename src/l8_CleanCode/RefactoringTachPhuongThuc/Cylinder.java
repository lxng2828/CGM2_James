package l8_CleanCode.RefactoringTachPhuongThuc;

public class Cylinder {

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);

        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
}