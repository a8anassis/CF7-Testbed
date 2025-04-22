package gr.aueb.cf.ch6;

public class Array17Symmetric8 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSymmetric = isSymmetric(arr);
        System.out.println(isSymmetric);
    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }

        return isSymmetric;
    }

    public static boolean isArraySymmetric(int[] arr) {

        boolean isSymmetric = true;
        int n = arr.length - 1;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

}
