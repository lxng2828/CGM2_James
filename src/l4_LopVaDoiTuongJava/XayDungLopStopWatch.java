package l4_LopVaDoiTuongJava;

public class XayDungLopStopWatch {
    public static void main(String[] args) {
        StopWatch S = new StopWatch();
        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100000 - i;
        }

        System.out.println("Bat dau chay ...");
        S.start();
        selectionSort(arr);
        S.stop();
        System.out.println("Ket thuc");
        System.out.println("Thoi gian sap xep: " + S.getElapsedTime() + " seconds");

    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
