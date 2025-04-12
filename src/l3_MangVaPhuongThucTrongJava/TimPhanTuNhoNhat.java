package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class TimPhanTuNhoNhat {
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
        System.out.printf("phan tu nho nhat trong mang la %d", findMin(arr));
        s.close();
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
