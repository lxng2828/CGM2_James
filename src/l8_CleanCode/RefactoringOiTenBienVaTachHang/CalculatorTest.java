package l8_CleanCode.RefactoringOiTenBienVaTachHang;

public class CalculatorTest {

    public static void testAddition() {
        int firstOperand = 5;
        int secondOperand = 3;
        char operator = Calculator.ADDITION;
        int expected = 8;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        if (result == expected) {
            System.out.println("Kiem thu phep cong: Thanh cong");
        } else {
            System.out.println("Kiem thu phep cong: That bai. Ket qua thuc te: " + result + ", Mong doi: " + expected);
        }
    }

    public static void testSubtraction() {
        int firstOperand = 10;
        int secondOperand = 4;
        char operator = Calculator.SUBTRACTION;
        int expected = 6;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        if (result == expected) {
            System.out.println("Kiem thu phep tru: Thanh cong");
        } else {
            System.out.println("Kiem thu phep tru: That bai. Ket qua thuc te: " + result + ", Mong doi: " + expected);
        }
    }

    public static void testMultiplication() {
        int firstOperand = 7;
        int secondOperand = 6;
        char operator = Calculator.MULTIPLICATION;
        int expected = 42;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        if (result == expected) {
            System.out.println("Kiem thu phep nhan: Thanh cong");
        } else {
            System.out.println("Kiem thu phep nhan: That bai. Ket qua thuc te: " + result + ", Mong doi: " + expected);
        }
    }

    public static void testDivision() {
        int firstOperand = 20;
        int secondOperand = 5;
        char operator = Calculator.DIVISION;
        int expected = 4;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        if (result == expected) {
            System.out.println("Kiem thu phep chia: Thanh cong");
        } else {
            System.out.println("Kiem thu phep chia: That bai. Ket qua thuc te: " + result + ", Mong doi: " + expected);
        }
    }

    public static void testDivisionByZero() {
        int firstOperand = 15;
        int secondOperand = 0;
        char operator = Calculator.DIVISION;
        System.out.println("Kiem thu phep chia cho 0:");
        try {
            Calculator.calculate(firstOperand, secondOperand, operator);
            System.out.println("Kiem thu phep chia cho 0: That bai. Khong nem ra ngoai le.");
        } catch (RuntimeException e) {
            if ("Can not divide by 0".equals(e.getMessage())) {
                System.out.println("Kiem thu phep chia cho 0: Thanh cong. Nem ra ngoai le dung.");
            } else {
                System.out.println("Kiem thu phep chia cho 0: That bai. Nem ra ngoai le sai: " + e.getMessage());
            }
        }
    }

    public static void testUnsupportedOperation() {
        int firstOperand = 10;
        int secondOperand = 2;
        char operator = '%';
        System.out.println("Kiem thu phep toan khong ho tro:");
        try {
            Calculator.calculate(firstOperand, secondOperand, operator);
            System.out.println("Kiem thu phep toan khong ho tro: That bai. Khong nem ra ngoai le.");
        } catch (RuntimeException e) {
            if ("Unsupported operation".equals(e.getMessage())) {
                System.out.println("Kiem thu phep toan khong ho tro: Thanh cong. Nem ra ngoai le dung.");
            } else {
                System.out.println("Kiem thu phep toan khong ho tro: That bai. Nem ra ngoai le sai: " + e.getMessage());
            }
        }
    }

    public static void runAllTests() {
        System.out.println("Bat dau kiem thu...");
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testDivisionByZero();
        testUnsupportedOperation();
        System.out.println("Hoan thanh kiem thu.");
    }
}