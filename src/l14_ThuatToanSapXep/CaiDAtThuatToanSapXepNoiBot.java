package l14_ThuatToanSapXep;


public class CaiDAtThuatToanSapXepNoiBot {

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 1, 4, 2, 8 };
        System.out.print("Mang ban dau: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        bubbleSort(numbers);

        System.out.print("Mang sau khi sap xep: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}