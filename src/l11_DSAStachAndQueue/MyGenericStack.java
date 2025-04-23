package l11_DSAStachAndQueue;

import java.util.EmptyStackException; // Su dung exception co ban cua Java

public class MyGenericStack<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;
    private int currentSize;

    public MyGenericStack() {
        top = null;
        currentSize = 0;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        currentSize++;
    }

    public T pop() {
        if (isEmpty()) {
            // Su dung EmptyStackException la mot cach xu ly loi co ban va chuan
            throw new EmptyStackException();
            // Hoac tra ve null neu muon don gian hon, nhung throw exception ro rang hon
            // return null;
        }
        T data = top.data;
        top = top.next;
        currentSize--;
        return data;
    }

    public int size() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }
}