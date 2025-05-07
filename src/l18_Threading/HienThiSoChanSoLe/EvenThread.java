package l18_Threading.HienThiSoChanSoLe;

public class EvenThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("So chan: " + i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Luong in so chan da bi gian doan.");
        }
        System.out.println("Luong in so chan da hoan thanh.");
    }
}