package l11_DSAStachAndQueue;

import java.util.Stack;

public class DaoNguocPhanTuTrongMangSoNguyenSuDungStack {
    
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5 };
        Stack<Integer> integerStack = new Stack<>();

        System.out.print("Mang so nguyen ban dau: ");
        printIntegerArray(originalArray);

        for (int element : originalArray) {
            integerStack.push(element);
        }

        int index = 0;
        while (!integerStack.isEmpty()) {
            originalArray[index] = integerStack.pop();
            index++;
        }

        System.out.print("Mang so nguyen sau khi dao nguoc: ");
        printIntegerArray(originalArray);
    }

    public static void printIntegerArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i < arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}