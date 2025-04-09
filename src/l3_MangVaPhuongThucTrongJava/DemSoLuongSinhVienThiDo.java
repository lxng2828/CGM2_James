package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap so luong sinh vien: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("diem cua sinh vien thu %d la ", (i + 1));
            arr[i] = s.nextInt();
        }
        System.out.println("diem cua cac sinh vien la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("diem cua sinh vien thu %d la %d \n", (i + 1), arr[i]);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                count++;
            }
        }
        System.out.println("so luong sinh vien do la: " + count);
        s.close();
    }
}
