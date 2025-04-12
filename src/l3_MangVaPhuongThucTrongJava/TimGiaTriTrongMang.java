package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap so sinh vien: ");
        int n = s.nextInt();
        s.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("sinh vien thu %d la : ", (i + 1));
            arr[i] = s.nextLine();
        }
        System.out.print("danh sach sinh vien la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d-%s, ", (i + 1), arr[i]);
        }
        System.out.println();
        System.out.print("nhap vao ten sinh vien can tim: ");
        String name = s.nextLine();
        int index = findIndex(arr, name);
        System.out.printf("vi tri cua sinh vien trong danh sach la %d", (index + 1));
        s.close();
    }

    public static int findIndex(String[] arr, String s) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
