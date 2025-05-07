package l15_XuLyNgoaiLeVaDebug.SuDungLopNumberFormatException;

import java.util.Scanner;

public class CalculationExample {

    private void calculate(int x, int y) {
        try {
            int sumResult = x + y;
            int differenceResult = x - y;
            int productResult = x * y;

            System.out.println("Tong x + y = " + sumResult);
            System.out.println("Hieu x - y = " + differenceResult);
            System.out.println("Tich x * y = " + productResult);

            int divisionResult = x / y;
            System.out.println("Thuong x / y = " + divisionResult);

        } catch (ArithmeticException arithmeticException) {
            System.err.println("Xay ra ngoai le: " + arithmeticException.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        try {
            System.out.println("Hay nhap x: ");
            String lineX = scanner.nextLine();
            x = Integer.parseInt(lineX);

            System.out.println("Hay nhap y: ");
            String lineY = scanner.nextLine();
            y = Integer.parseInt(lineY);

            CalculationExample calc = new CalculationExample();
            calc.calculate(x, y);

        } catch (NumberFormatException numberFormatException) {
            System.err.println("Du lieu dau vao khong phai la so nguyen hop le.");
        } finally {
            scanner.close();
        }
    }
}