package l1_IntroductionToJava;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("giai phuong trinh bac 1 : ax + b = 0");
        System.out.print("nhap a: ");
        double a = s.nextDouble();
        System.out.print("nhap b: ");
        double b = s.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("nghiem cua phuong trinh la x = " + x);
        }

        s.close();
    }
}
