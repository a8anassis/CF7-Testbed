package gr.aueb.cf.ch6;

public class Array22CombinationsApp8 {

    public static void main(String[] args) {
        int[] initialArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int m = 4;
        int[] row = new int[m];
        int size = initialArr.length - m;
        int counter = 0;

        for (int i = 0; i <= size - m; i++) {
            for (int j = i + 1; j <= size - m + 1; j++) {
                for (int l = j + 1; l <= size - m + 2; l++) {
                    for (int n = l + 1; n <= size - m + 3; n++) {
                        counter++;
                        row[0] = initialArr[i];
                        row[1] = initialArr[j];
                        row[2] = initialArr[l];
                        row[3] = initialArr[n];

                        if (!isEven(row, 2)) {
                            System.out.printf("%4d. \t%d\t%d\t%d\t%d\n", counter, row[0], row[1], row[2], row[3]);
                        }
                    }
                }
            }
        }
    }

    public static boolean isEven(int[] row, int threshold) {
        int evens = 0;

        for (int num : row) {
            if (num % 2 == 0) evens++;
            //if (evens > threshold) return false;  // early exit
        }

        //return true;
        return evens > threshold;
    }
}
