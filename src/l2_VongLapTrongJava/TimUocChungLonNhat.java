package l2_VongLapTrongJava;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Uoc chung lon nhat cua " + number + " la " + greatestCommonDivisor(number));

    }

    public static int greatestCommonDivisor(int num) {
        int greatestDivisor = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }
}
