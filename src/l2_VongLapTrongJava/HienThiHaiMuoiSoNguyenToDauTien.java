package l2_VongLapTrongJava;

import java.util.Scanner;

public class HienThiHaiMuoiSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen to muon in ra: ");
        int numbers = scanner.nextInt();

        int count = 0;
        int N = 2;
        System.out.println("\nCac so nguyen to dau tien la:");
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
