package l14_ThuatToanSapXep;

import java.util.Arrays;
import java.util.Scanner;

public class MinhHoaThuatToanSapXepChen {

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            System.out.println("Bat dau chen phan tu " + currentElement + " tai vi tri " + i);
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                System.out.println("  Di chuyen " + list[j] + " sang phai");
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
            System.out.println("  Chen " + currentElement + " vao vi tri " + (j + 1));
            System.out.println("Mang sau buoc " + i + ": " + Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhap " + list.length + " gia tri:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Mang ban dau: " + Arrays.toString(list));
        System.out.println("\nBat dau qua trinh sap xep chen...");
        insertionSortByStep(list);
        scanner.close();
    }
}