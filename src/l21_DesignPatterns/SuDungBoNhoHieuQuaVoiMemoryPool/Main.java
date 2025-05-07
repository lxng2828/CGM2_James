package l21_DesignPatterns.SuDungBoNhoHieuQuaVoiMemoryPool;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();

        System.out.println("Bat dau ban khong su dung Pool...");
        Bullet.count = 0; // Reset bo dem dan truoc moi lan test
        gun.fire();
        System.out.println("Tro choi ket thuc (khong su dung Pool).");
        System.out.println("Tong so dan da duoc tao: " + Bullet.count);

        System.out.println("\n---------------------------------------\n");

        System.out.println("Bat dau ban su dung Pool...");
        Bullet.count = 0;
        gun.fireInPool();
        System.out.println("Tro choi ket thuc (su dung Pool).");
        System.out.println("Tong so dan da duoc tao: " + Bullet.count);
    }
}