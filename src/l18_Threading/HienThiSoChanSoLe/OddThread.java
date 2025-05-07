package l18_Threading.HienThiSoChanSoLe;

public class OddThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("So le: " + i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Luong in so le da bi gian doan.");
        }
        System.out.println("Luong in so le da hoan thanh.");
    }
}