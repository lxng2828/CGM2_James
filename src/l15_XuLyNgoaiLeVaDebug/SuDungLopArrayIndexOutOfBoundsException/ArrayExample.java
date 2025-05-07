package l15_XuLyNgoaiLeVaDebug.SuDungLopArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public Integer[] createRandom() {
        Random randomGenerator = new Random();
        Integer[] integerArray = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            integerArray[i] = randomGenerator.nextInt(101); // Tao so ngau nhien tu 0 den 100
            System.out.print(integerArray[i] + " ");
        }
        System.out.println(); // Them dong moi cho de nhin
        return integerArray;
    }

    public static void main(String[] args) {
        ArrayExample arrayExampleInstance = new ArrayExample();
        Integer[] randomNumbers = arrayExampleInstance.createRandom();

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua mot phan tu bat ky: ");

        try {
            int selectedIndex = inputScanner.nextInt();
            System.out
                    .println("Gia tri cua phan tu co chi so " + selectedIndex + " la " + randomNumbers[selectedIndex]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chi so vuot qua gioi han cua mang.");
        } catch (java.util.InputMismatchException e) {
            System.err.println("Vui long chi nhap so nguyen cho chi so.");
        } finally {
            inputScanner.close(); // Dong Scanner de tranh ro ri tai nguyen
        }

        System.out.println("Ket thuc chuong trinh.");
    }
}
