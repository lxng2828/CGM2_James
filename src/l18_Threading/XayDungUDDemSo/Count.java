package l18_Threading.XayDungUDDemSo;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "My runnable thread");
        System.out.println("Da tao luong: " + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Dang in gia tri dem: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Luong cua toi bi gian doan");
        }
        System.out.println("Luong cua toi da hoan thanh viec chay");
    }
}
