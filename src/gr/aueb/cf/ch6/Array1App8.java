package gr.aueb.cf.ch6;

/**
 * Arrays is Java. Zero-based ordered collections.
 */
public class Array1App8 {

    public static void main(String[] args) {
        int[] arr = new int[5]; // arrays are zer-based
        arr[0] = 1;
        arr[1] = 2;
        arr[3] = 10;
        arr[4] = 22;

        System.out.println("First element: " + arr[0]);
        System.out.println("Array Length: " + arr.length);
        System.out.println("Last element: " + arr[4]);
        System.out.println("Last element generally: " + arr[arr.length - 1]);
    }
}
