package l10_DSADanhSach;

public class TrienKhaiLopLinkedListDonGian {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 8);

        ll.printList();

        System.out.println("Phan tu tai chi so 3: " + ll.get(3).getData());
    }
}