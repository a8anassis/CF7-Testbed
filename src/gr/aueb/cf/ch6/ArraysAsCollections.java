package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9};
    }


    // Filtering
    public static int[] getEvens(int[] arr) {
        int count = 0;
        int pivot = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        for (int el : arr) {
            if (el % 2 == 0)
                evens[pivot++] = el;
        }
        return evens;
    }

    // Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }


}
