package l8_CleanCode.RefactoringTachBien;

public class Main {
    public static void main(String[] args) {
        FizzBuzzTest.runAllTests();

        System.out.println("\nChay thu FizzBuzz cho cac so tu 1 den 20:");
        for (int i = 1; i <= 20; i++) {
            System.out.println("So " + i + ": " + FizzBuzz.fizzBuzz(i));
        }
    }
}