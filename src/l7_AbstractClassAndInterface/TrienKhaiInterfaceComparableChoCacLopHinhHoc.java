package l7_AbstractClassAndInterface;

import java.util.Arrays;

public class TrienKhaiInterfaceComparableChoCacLopHinhHoc {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.0);
        circles[1] = new ComparableCircle(1.0);
        circles[2] = new ComparableCircle(2.0);

        System.out.println("Before sorting:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After sorting:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
