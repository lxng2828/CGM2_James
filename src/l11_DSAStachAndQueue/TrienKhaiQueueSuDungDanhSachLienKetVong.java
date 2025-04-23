package l11_DSAStachAndQueue;

public class TrienKhaiQueueSuDungDanhSachLienKetVong {

//

    public static void main(String[] args) {
        CircularQueue myQueue = new CircularQueue();

        myQueue.displayQueue();

        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);

        myQueue.displayQueue();

        myQueue.deQueue();
        myQueue.displayQueue();

        myQueue.enQueue(40);
        myQueue.displayQueue();

        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.displayQueue();

        myQueue.deQueue();
        myQueue.displayQueue();

        myQueue.deQueue();
    }
}
