package l15_XuLyNgoaiLeVaDebug.SuDungLopIllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleSidesInputHandler {

    public static void checkTriangleSides(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalTriangleException("Do dai cac canh phai la so duong.");
        }
        if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA)) {
            throw new IllegalTriangleException("Tong hai canh bat ky phai lon hon canh con lai.");
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        boolean validInputForSides = false;

        while (!validInputForSides) {
            try {
                System.out.println("Nhap do dai canh thu nhat: ");
                side1 = inputScanner.nextDouble();

                System.out.println("Nhap do dai canh thu hai: ");
                side2 = inputScanner.nextDouble();

                System.out.println("Nhap do dai canh thu ba: ");
                side3 = inputScanner.nextDouble();

                validInputForSides = true;

            } catch (InputMismatchException e) {
                System.err.println("Du lieu dau vao khong hop le. Vui long nhap so thuc.");
                inputScanner.nextLine();
            }
        }

        try {
            checkTriangleSides(side1, side2, side3);
            System.out.println("Ba canh da nhap tao thanh mot tam giac hop le.");
        } catch (IllegalTriangleException e) {
            System.err.println("Loi: " + e.getMessage());
        } finally {
            if (inputScanner != null) {
                inputScanner.close();
            }
        }
    }
}