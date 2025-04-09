package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("chuyen doi nhiet do:\n1,do C sang do F\n2,do F sang do C");
        int c = s.nextInt();
        if (c == 1) {
            System.out.print("Nhap nhiet do C ");
            double celsius = s.nextInt();
            double fahrenheit = (9.0 / 5) * celsius + 32;
            System.out.printf("Nhiet do F la %f", fahrenheit);
        } else if (c == 2) {
            System.out.print("Nhap nhiet do F ");
            double fahrenheit = s.nextInt();
            double celsius = (5.0 / 9) * (fahrenheit - 32);
            System.out.printf("Nhiet do C la %f", celsius);
        } else {
            System.out.println("khong hop le");
        }
        s.close();
    }
}
