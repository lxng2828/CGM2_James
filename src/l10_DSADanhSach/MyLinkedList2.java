package l10_DSADanhSach;

import java.util.NoSuchElementException;

public class MyLinkedList2<E> {
    private Node2<E> head;
    private int numNode2s;

    public MyLinkedList2() {
        head = null;
        numNode2s = 0;
    }

    public int size() {
        return numNode2s;
    }

    public boolean isEmpty() {
        return numNode2s == 0;
    }

    public void addFirst(E element) {
        Node2<E> newNode2 = new Node2<>(element);
        newNode2.next = head;
        head = newNode2;
        numNode2s++;
    }

    public void addLast(E element) {
        if (head == null) {
            addFirst(element);
        } else {
            Node2<E> newNode2 = new Node2<>(element);
            Node2<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode2;
            numNode2s++;
        }
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNode2s) {
            throw new IndexOutOfBoundsException("Index khong hop le: " + index);
        }

        if (index == 0) {
            addFirst(element);
        } else if (index == numNode2s) {
            addLast(element);
        } else {
            Node2<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node2<E> newNode2 = new Node2<>(element);
            newNode2.next = temp.next;
            temp.next = newNode2;
            numNode2s++;
        }
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= numNode2s) {
            throw new IndexOutOfBoundsException("Index khong hop le: " + index);
        }
        Node2<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E getFirst() {
        if (head == null) {
            throw new NoSuchElementException("Danh sach rong");
        }
        return head.data;
    }

    public E getLast() {
        if (head == null) {
            throw new NoSuchElementException("Danh sach rong");
        }
        Node2<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNode2s) {
            throw new IndexOutOfBoundsException("Index khong hop le: " + index);
        }

        E removedElement;
        if (index == 0) {
            removedElement = head.data;
            head = head.next;
        } else {
            Node2<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node2<E> Node2ToRemove = temp.next;
            removedElement = Node2ToRemove.data;
            temp.next = Node2ToRemove.next;
        }
        numNode2s--;
        return removedElement;
    }

    public boolean remove(Object e) {
        if (head == null) {
            return false;
        }

        if (isEqual(head.data, e)) {
            head = head.next;
            numNode2s--;
            return true;
        }

        Node2<E> temp = head;
        while (temp.next != null) {
            if (isEqual(temp.next.data, e)) {
                temp.next = temp.next.next;
                numNode2s--;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public void clear() {
        head = null;
        numNode2s = 0;
    }

    public boolean contains(E e) {
        return indexOf(e) != -1;
    }

    public int indexOf(E e) {
        Node2<E> temp = head;
        for (int i = 0; i < numNode2s; i++) {
            if (isEqual(temp.data, e)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public Object clone() {
        MyLinkedList2<E> clonedList = new MyLinkedList2<>();
        Node2<E> temp = head;
        while (temp != null) {
            clonedList.addLast(temp.data);
            temp = temp.next;
        }
        return clonedList;
    }

    private boolean isEqual(Object data1, Object data2) {
        if (data1 == null) {
            return data2 == null;
        } else {
            return data1.equals(data2);
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node2<E> temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append(", ");
            }
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
