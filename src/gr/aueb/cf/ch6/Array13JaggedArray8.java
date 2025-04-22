package gr.aueb.cf.ch6;

/**
 * Jagged Arrays are the arrays that may include
 * different dimensions. Not grids in the traditional manner.
 */
public class Array13JaggedArray8 {

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[6];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : arr) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
