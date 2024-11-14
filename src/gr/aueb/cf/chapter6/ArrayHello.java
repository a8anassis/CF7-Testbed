package gr.aueb.cf.chapter6;

public class ArrayHello {

    public static void main(String[] args) {
        int[] arr = new int[3];    // declare and init

        // Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // traverse
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
