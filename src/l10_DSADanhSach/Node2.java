package l10_DSADanhSach;

public class Node2<E> {
    E data;
    Node2<E> next;

    public Node2(E data){
        this.data = data;
        this.next = null;
    }

    public E getData(){
        return data;
    }
}
