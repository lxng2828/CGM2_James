package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 1, 3, 5, 7, 9, 7, 11 };
        int n = arr.length;

        System.out.print("Mang ban dau: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.print("\nNhap phan tu can them: ");
        int x = scanner.nextInt();
        System.out.print("Nhap vi tri can them: ");
        int index_add = scanner.nextInt();

        if (index_add < 0 || index_add > n) {
            System.out.println("Vi tri khong hop le.");
        } else {
            int[] newArr = new int[n + 1];
            for (int i = 0; i < index_add; i++) {
                newArr[i] = arr[i];
            }
            newArr[index_add] = x;
            for (int i = index_add; i < n; i++) {
                newArr[i + 1] = arr[i];
            }

            System.out.print("Mang sau khi them: ");
            for (int value : newArr) {
                System.out.print(value + " ");
            }
        }

        scanner.close();
    }
}

