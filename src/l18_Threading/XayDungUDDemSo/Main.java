package l18_Threading.XayDungUDDemSo;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Luong chinh se duy tri cho den khi luong con ket thuc");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Luong chinh bi gian doan");
        }
        System.out.println("Luong chinh da hoan thanh viec chay");
    }
}