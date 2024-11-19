package gr.aueb.cf.ch6;

public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {1, 10};
        int[] arr6 = {1};
        swap(arr);
        printArray(arr);
    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;

        arr = new int[2];
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
