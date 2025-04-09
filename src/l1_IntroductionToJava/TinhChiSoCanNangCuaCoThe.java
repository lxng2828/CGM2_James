package l1_IntroductionToJava;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap vao can nang (kg): ");
        double weight = s.nextDouble();

        System.out.print("Nhap vao chieu cao (m): ");
        double height = s.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        System.out.printf("Chi so BMI cua ban la: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Ban dang gay (Underweight)");
        } else if (bmi < 25) {
            System.out.println("Can nang binh thuong (Normal weight)");
        } else if (bmi < 30) {
            System.out.println("Hoi beo (Overweight)");
        } else {
            System.out.println("Beo phi (Obese)");
        }

        s.close();
    }
}
