package gr.aueb.cf.ch6;

/**
 * Unsized init
 */
public class Array2Unsized8 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print("...");
        System.out.println(arr[arr.length - 1]);
    }
}
