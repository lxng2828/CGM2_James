package l1_IntroductionToJava;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap vao nam: ");
        int year = s.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " la nam nhuan");
                } else {
                    System.out.println(year + " khong la nam nhuan");
                }
            } else {
                System.out.println(year + " la nam nhuan");
            }
        } else {
            System.out.println(year + " khong la nam nhuan");
        }
        s.close();
    }
}
