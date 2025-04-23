package l11_DSAStachAndQueue;

public class TrienKhaiQueueSuDungDanhSachLienKet {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();

        System.out.println("Them phan tu vao hang doi:");
        queue.enqueue(10);
        System.out.println(" Da them: 10");
        queue.enqueue(20);
        System.out.println(" Da them: 20");
        queue.enqueue(30);
        System.out.println(" Da them: 30");
        queue.enqueue(40);
        System.out.println(" Da them: 40");
        queue.enqueue(50);
        System.out.println(" Da them: 50");

        System.out.println("\nLay phan tu ra khoi hang doi:");
        Node removedNode;
        while ((removedNode = queue.dequeue()) != null) {
            System.out.println(" Lay ra phan tu: " + removedNode.key);
        }

        System.out.println("\nKiem tra hang doi sau khi lay het phan tu:");
        if (queue.head == null) {
            System.out.println(" Hang doi rong.");
        } else {
            System.out.println(" Hang doi khong rong.");
        }

        System.out.println("\nThem phan tu 60:");
        queue.enqueue(60);
        System.out.println(" Da them: 60");
        System.out.println("Lay phan tu ra:");
        removedNode = queue.dequeue();
        if (removedNode != null) {
            System.out.println(" Lay ra phan tu: " + removedNode.key);
        } else {
            System.out.println(" Hang doi rong, khong lay duoc.");
        }

        System.out.println("\nThu lay phan tu tu hang doi rong:");
        removedNode = queue.dequeue();
        if (removedNode != null) {
            System.out.println(" Lay ra phan tu: " + removedNode.key);
        } else {
            System.out.println(" Hang doi rong, khong lay duoc.");
        }
    }
}