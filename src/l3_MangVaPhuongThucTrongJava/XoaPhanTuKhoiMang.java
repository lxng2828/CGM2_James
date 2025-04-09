package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 1, 3, 5, 7, 9, 7, 11 };
        int n = arr.length;

        System.out.print("Mang ban dau: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.print("\nNhap phan tu can xoa: ");
        int x = scanner.nextInt();
        int index_del = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            for (int i = index_del; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.print("Mang sau khi xoa: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Phan tu " + x + " khong ton tai trong mang.");
        }

        scanner.close();
    }
}

