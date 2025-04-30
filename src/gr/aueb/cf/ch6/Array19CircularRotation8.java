package gr.aueb.cf.ch6;

public class Array19CircularRotation8 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] leftShifted = doLeftShift(arr, 2);
        int[] rightShifted = doRightShift(arr, 3);
        printArr(leftShifted);
        printArr(rightShifted);
    }

    public static int[] doLeftShift(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }

    public static int[] doRightShift(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static void printArr(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
