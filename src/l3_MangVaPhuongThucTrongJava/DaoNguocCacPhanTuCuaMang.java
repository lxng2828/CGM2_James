package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        System.out.print("Nhap kich thuoc mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap gia tri phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Mang ban dau la: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        reverse(arr);
        System.out.println();
        System.out.print("Mang sau khi reverse la: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        scanner.close();
    }

    public static int[] reverse(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }

}
