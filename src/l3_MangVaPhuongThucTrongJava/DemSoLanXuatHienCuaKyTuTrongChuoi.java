package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "how are you";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ky tu can dem: ");
        char c = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        System.out.println("Ky tu '" + c + "' xuat hien " + count + " lan trong chuoi.");
        scanner.close();
    }
}