package l21_DesignPatterns.TrienKhaiObjectPool;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TaxiThread implements Runnable {
    private TaxiPool taxiPool;

    public TaxiThread(TaxiPool taxiPool) {
        this.taxiPool = taxiPool;
    }

    @Override
    public void run() {
        takeATaxi();
    }

    private void takeATaxi() {
        System.out.println("Khach hang moi: " + Thread.currentThread().getName());
        try {
            Taxi taxi = taxiPool.getTaxi();
            System.out.println(taxi.getName() + " dang phuc vu khach: " + Thread.currentThread().getName());
            TimeUnit.MILLISECONDS.sleep(randInt(1000, 1500));
            taxiPool.release(taxi);
            System.out.println("Da phuc vu xong khach hang: " + Thread.currentThread().getName() + ", xe "
                    + taxi.getName() + " da tra ve pool.");
        } catch (InterruptedException e) {
            System.out.println(">>>Yeu cau cua khach hang " + Thread.currentThread().getName() + " bi gian doan.");
            Thread.currentThread().interrupt();
        } catch (TaxiNotFoundException e) {
            System.out.println(
                    ">>>Da tu choi khach hang: " + Thread.currentThread().getName() + " do khong tim duoc taxi.");
        }
    }

    private int randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
