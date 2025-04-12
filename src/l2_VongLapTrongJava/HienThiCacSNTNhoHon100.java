package l2_VongLapTrongJava;

public class HienThiCacSNTNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100 la:");

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
