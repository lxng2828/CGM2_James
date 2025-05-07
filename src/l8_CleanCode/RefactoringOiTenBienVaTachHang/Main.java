package l8_CleanCode.RefactoringOiTenBienVaTachHang;

public class Main {
    public static void main(String[] args) {
        CalculatorTest.runAllTests();

        System.out.println("\nChay thu mot vai phep tinh:");
        int num1 = 100;
        int num2 = 25;

        int sum = Calculator.calculate(num1, num2, Calculator.ADDITION);
        System.out.println(num1 + " + " + num2 + " = " + sum);

        int difference = Calculator.calculate(num1, num2, Calculator.SUBTRACTION);
        System.out.println(num1 + " - " + num2 + " = " + difference);

        int product = Calculator.calculate(num1, num2, Calculator.MULTIPLICATION);
        System.out.println(num1 + " * " + num2 + " = " + product);

        int quotient = Calculator.calculate(num1, num2, Calculator.DIVISION);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        System.out.println("\nThu phep chia cho 0:");
        try {
            Calculator.calculate(num1, 0, Calculator.DIVISION);
        } catch (RuntimeException e) {
            // Loi da duoc in ra tu phuong thuc calculate
        }
    }
}