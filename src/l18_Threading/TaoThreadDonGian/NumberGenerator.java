package l18_Threading.TaoThreadDonGian;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(
                        Thread.currentThread().getName() + " - Number: " + i + ", HashCode: " + this.hashCode());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();

        Thread thread1 = new Thread(generator);
        Thread thread2 = new Thread(generator);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread 1 priority: " + thread1.getPriority());
        System.out.println("Thread 2 priority: " + thread2.getPriority());

        thread1.start();
        thread2.start();
    }
}

