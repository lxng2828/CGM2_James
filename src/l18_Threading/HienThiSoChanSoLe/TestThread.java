package l18_Threading.HienThiSoChanSoLe;


public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        System.out.println("Bat dau luong in so le...");
        oddThread.start();

        System.out.println("Bat dau luong in so chan...");
        evenThread.start();
    }
}