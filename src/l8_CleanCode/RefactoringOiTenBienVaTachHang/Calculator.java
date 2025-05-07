package l8_CleanCode.RefactoringOiTenBienVaTachHang;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    System.out.println("Loi: Khong the chia cho 0");
                    throw new RuntimeException("Can not divide by 0");
                }
            default:
                System.out.println("Loi: Phep toan khong duoc ho tro");
                throw new RuntimeException("Unsupported operation");
        }
    }
}