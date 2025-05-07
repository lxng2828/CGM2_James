package l21_DesignPatterns.TrienKhaiObjectPool;

public class ObjectPoolDemo {
    public static final int NUM_OF_CLIENT = 8;

    public static void main(String[] args) {
        TaxiPool taxiPool = new TaxiPool();
        System.out.println("Mo phong voi " + (NUM_OF_CLIENT - 1) + " khach hang...");
        for (int i = 1; i < NUM_OF_CLIENT; i++) {
            Runnable client = new TaxiThread(taxiPool);
            Thread thread = new Thread(client);
            thread.setName("KhachHang-" + i);
            thread.start();
        }
    }
}
