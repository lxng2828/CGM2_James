package l3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };
        System.out.print("Nhap chi so cot (tu 0 den 5): ");
        Scanner s = new Scanner(System.in);
        int colIndex = s.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][colIndex - 1];
        }
        System.out.println("Tong cac so trong cot " + colIndex + " la: " + sum);
        s.close();

    }
}
