package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = reverseArray(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
