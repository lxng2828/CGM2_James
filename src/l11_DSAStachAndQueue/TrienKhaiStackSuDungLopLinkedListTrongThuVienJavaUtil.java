package l11_DSAStachAndQueue;

import java.util.EmptyStackException;

public class TrienKhaiStackSuDungLopLinkedListTrongThuVienJavaUtil {

    public static void stackOfStrings() {
        MyGenericStack<String> stringStack = new MyGenericStack<>();

        stringStack.push("Nam");
        stringStack.push("Bon");
        stringStack.push("Ba");
        stringStack.push("Hai");
        stringStack.push("Mot");

        System.out.println("1.1 Kich thuoc cua stack sau khi push: " + stringStack.size());
        System.out.println("1.2 Lay phan tu tu stack:");

        try {
            while (!stringStack.isEmpty()) {
                System.out.printf(" %s", stringStack.pop());
            }
        } catch (EmptyStackException e) {
            System.out.println("\n Loi: Stack rong!");
        }

        System.out.println("\n1.3 Kich thuoc cua stack sau khi pop: " + stringStack.size());
    }

    public static void stackOfIntegers() {
        MyGenericStack<Integer> integerStack = new MyGenericStack<>();

        integerStack.push(5);
        integerStack.push(4);
        integerStack.push(3);
        integerStack.push(2);
        integerStack.push(1);

        System.out.println("\n2.1 Kich thuoc cua stack sau khi push: " + integerStack.size());
        System.out.println("2.2 Lay phan tu tu stack:");

        try {
            while (!integerStack.isEmpty()) {
                System.out.printf(" %d", integerStack.pop());
            }
        } catch (EmptyStackException e) {
            System.out.println("\n Loi: Stack rong!");
        }

        System.out.println("\n2.3 Kich thuoc cua stack sau khi pop: " + integerStack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack voi chuoi:");
        stackOfStrings();
        System.out.println("\n--------------");
        System.out.println("2. Stack voi so nguyen:");
        stackOfIntegers();
    }
}