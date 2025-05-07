package l8_CleanCode.RefactoringTachBien;

public class FizzBuzzTest {

    public static void testFizz() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        if (expected.equals(result)) {
            System.out.println("Kiem thu voi so " + number + ": Thanh cong (Mong doi: " + expected + ")");
        } else {
            System.out.println(
                    "Kiem thu voi so " + number + ": That bai (Mong doi: " + expected + ", Thuc te: " + result + ")");
        }

        number = 6;
        result = FizzBuzz.fizzBuzz(number);
        if (expected.equals(result)) {
            System.out.println("Kiem thu voi so " + number + ": Thanh cong (Mong doi: " + expected + ")");
        } else {
            System.out.println(
                    "Kiem thu voi so " + number + ": That bai (Mong doi: " + expected + ", Thuc te: " + result + ")");
        }
    }

    public static void testBuzz() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        if (expected.equals(result)) {
            System.out.println("Kiem thu voi so " + number + ": Thanh cong (Mong doi: " + expected + ")");
        } else {
            System.out.println(
                    "Kiem thu voi so " + number + ": That bai (Mong doi: " + expected + ", Thuc te: " + result + ")");
        }

        number = 10;
        result = FizzBuzz.fizzBuzz(number);
        if (expected.equals(result)) {
            System.out.println("Kiem thu voi so " + number + ": Thanh cong (Mong doi: " + expected + ")");
        } else {
            System.out.println(
                    "Kiem thu voi so " + number + ": That bai (Mong doi: " + expected + ", Thuc te: " + result + ")");
        }
    }

    public static void testFizzBuzz() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        if (expected.equals(result)) {
            System.out.println("Kiem thu voi so " + number + ": Thanh cong (Mong doi: " + expected + ")");
        } else {
            System.out.println(
                    "Kiem thu voi so " + number + ": That bai (Mong doi: " + expected + ", Thuc te: " + result + ")");
        }

        number = 30;
        result = FizzBuzz.fizzBuzz(number);
        if (expected.equals(result)) {
            System.out.println("Kiem thu voi so " + number + ": Thanh cong (Mong doi: " + expected + ")");
        } else {
            System.out.println(
                    "Kiem thu voi so " + number + ": That bai (Mong doi: " + expected + ", Thuc te: " + result + ")");
        }
    }

    public static void testNumber() {
        int number = 2;
        String expected = "2";
        String result = FizzBuzz.fizzBuzz(number);
        if (expected.equals(result)) {
            System.out.println("Kiem thu voi so " + number + ": Thanh cong (Mong doi: " + expected + ")");
        } else {
            System.out.println(
                    "Kiem thu voi so " + number + ": That bai (Mong doi: " + expected + ", Thuc te: " + result + ")");
        }

        number = 11;
        expected = "11";
        result = FizzBuzz.fizzBuzz(number);
        if (expected.equals(result)) {
            System.out.println("Kiem thu voi so " + number + ": Thanh cong (Mong doi: " + expected + ")");
        } else {
            System.out.println(
                    "Kiem thu voi so " + number + ": That bai (Mong doi: " + expected + ", Thuc te: " + result + ")");
        }
    }

    public static void runAllTests() {
        System.out.println("Bat dau kiem thu FizzBuzz...");
        testFizz();
        testBuzz();
        testFizzBuzz();
        testNumber();
        System.out.println("Hoan thanh kiem thu FizzBuzz.");
    }
}