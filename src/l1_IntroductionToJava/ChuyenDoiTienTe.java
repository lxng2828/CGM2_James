package l1_IntroductionToJava;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Chuyen VND sang USD");
        System.out.println("2. Chuyen USD sang VND");
        System.out.print("Nhap vao lua chon: ");
        int choose = scanner.nextInt();

        if (choose == 1) {
            System.out.print("Nhap vao so tien VND: ");
            double vnd = scanner.nextDouble();
            double usd = vnd / 23000;
            System.out.println(vnd + " VND = " + usd + " USD");
        } else if (choose == 2) {
            System.out.print("Nhap vao so tien USD: ");
            double usd = scanner.nextDouble();
            double vnd = usd * 23000;
            System.out.println(usd + " USD = " + vnd + " VND");
        }
    }
}
