package l1_IntroductionToJava;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap vao so thang (1 - 12): ");
        int month = s.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " co 31 ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " co 30 ngay.");
                break;
            case 2:
                System.out.println("Thang 2 co 28 hoac 29 ngay (tuy nam nhuan).");
                break;
            default:
                System.out.println("Khong hop le! Vui long nhap so thang tu 1 den 12.");
        }

        s.close();
    }
}
