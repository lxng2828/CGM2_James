package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        int n = s.nextInt();
        s.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhap phan tu thu %d: ", (i + 1));
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("phan tu thu %d la %d, ", (i + 1), arr[i]);
        }
        System.out.println();
        System.out.printf("phan tu lon nhat trong mang la %d",findMax(arr));
        s.close();
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
