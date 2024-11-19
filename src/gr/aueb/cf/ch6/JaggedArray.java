package gr.aueb.cf.ch6;

public class JaggedArray {

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[6];

        for (int[] row : arr) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
