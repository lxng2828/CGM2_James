package l14_ThuatToanSapXep;

// 
public class CaiDAtThuatToanSapXepChen {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 1, 4, 2, 8 };
        System.out.print("Mang ban dau: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        insertionSort(numbers);

        System.out.print("Mang sau khi sap xep: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}