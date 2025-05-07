package l8_CleanCode.RefactoringTachPhuongThuc;

public class Main {
    public static void main(String[] args) {
        CylinderTest.runAllTests();

        System.out.println("\nChay thu tinh toan voi Cylinder:");
        int R1 = 5;
        int H1 = 10;
        double result1 = Cylinder.getVolume(R1, H1);
        System.out.println(
                "Ket qua (dien tich toan phan) cho hinh tru ban kinh " + R1 + ", chieu cao " + H1 + " la: " + result1);

        int R2 = 7;
        int H2 = 3;
        double result2 = Cylinder.getVolume(R2, H2);
        System.out.println(
                "Ket qua (dien tich toan phan) cho hinh tru ban kinh " + R2 + ", chieu cao " + H2 + " la: " + result2);


    }
}