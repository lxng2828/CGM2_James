package l14_ThuatToanSapXep;

import java.util.Scanner;

public class MinhHoaThuatToanSapXepNoiBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc mang: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhap " + list.length + " gia tri:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Mang ban dau cua ban: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBat dau qua trinh sap xep...");
        bubbleSortByStep(list);
        scanner.close();
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Doi cho " + list[i] + " voi " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Mang co the da duoc sap xep va khong can buoc tiep theo");
                break;
            }
            System.out.print("Mang sau buoc " + k + ": ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}