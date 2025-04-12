package l2_VongLapTrongJava;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        int number = scanner.nextInt();
        if (isPrimeNumber(number)) {
            System.out.println(number + " la so nguyen to");
        } else {
            System.out.println(number + " khong la so nguyen to");
        }
        scanner.close();
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
