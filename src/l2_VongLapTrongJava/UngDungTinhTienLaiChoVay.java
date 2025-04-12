package l2_VongLapTrongJava;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien cho vay: ");
        int principalAmount = scanner.nextInt();
        System.out.print("Nhap ty le lai theo thang: ");
        int monthlyInterestRate = scanner.nextInt();
        System.out.print("Nhap so thang cho vay: ");
        int numberOfMonths = scanner.nextInt();
        System.out.println("So tien cho vay: " + principalAmount);
        System.out.println("Ty le lai theo thang: " + monthlyInterestRate);
        System.out.println("So thang cho vay: " + numberOfMonths);
        double totalInterest = calculateInterest(principalAmount, monthlyInterestRate, numberOfMonths);
        System.out.println("Tien lai: " + totalInterest);
        scanner.close();
    }

    public static double calculateInterest(double principalAmount, double annualInterestRate, int numberOfMonths) {
        return principalAmount * (annualInterestRate / 1200) * numberOfMonths;
    }
}