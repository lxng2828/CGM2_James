package l18_Threading.THTaoLuongBangRunnable;

public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Dang tao luong " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Dang chay luong " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Luong: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Luong " + threadName + " da bi gian doan.");
        }
        System.out.println("Luong " + threadName + " dang ket thuc.");
    }

    public void start() {
        System.out.println("Bat dau luong " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}