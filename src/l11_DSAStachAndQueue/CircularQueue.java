package l11_DSAStachAndQueue;

// File: CircularQueue.java

public class CircularQueue {
    private Node2 front;
    private Node2 rear;

    public CircularQueue() {
        this.front = null;
        this.rear = null;
    }

    // Ham them phan tu vao cuoi hang doi (rear)
    public void enQueue(int data) {
        Node2 newNode2 = new Node2(data);

        if (this.rear == null) {
            this.front = newNode2;
            this.rear = newNode2;
            this.rear.link = this.front;
            System.out.println("Da them phan tu: " + data);
        } else {
            this.rear.link = newNode2;
            this.rear = newNode2;
            this.rear.link = this.front;
            System.out.println("Da them phan tu: " + data);
        }
    }

    // Ham lay phan tu tu dau hang doi (front)
    public Integer deQueue() {
        if (this.front == null) {
            System.out.println("Loi: Hang doi rong, khong the lay phan tu.");
            return null;
        }

        int dataToReturn = this.front.data;
        Node2 temp = this.front;

        if (this.front == this.rear) {
            this.front = null;
            this.rear = null;
        } else {
            this.front = this.front.link;
            this.rear.link = this.front;
        }

        System.out.println("Da lay phan tu: " + dataToReturn);
        return dataToReturn;
    }

    // Ham hien thi cac phan tu trong hang doi
    public void displayQueue() {
        if (this.front == null) {
            System.out.println("Hang doi rong.");
            return;
        }

        System.out.print("Cac phan tu trong hang doi (Front -> Rear): ");
        Node2 temp = this.front;
        do {
            System.out.print(temp.data);
            temp = temp.link;
            if (temp != this.front) {
                System.out.print(" -> ");
            }
        } while (temp != this.front);
        System.out.println();
    }
}
