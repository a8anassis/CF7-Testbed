package gr.aueb.cf.solutions.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {

    }

    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }

    public static void getEvens(int[] arr) {
        for (int el : arr) {
            if (el % 2 == 0) System.out.println(el);
        }
    }

    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static boolean anyPositive(int[] arr) {
        boolean isAnyPositive = false;

        for (int el : arr) {
            if (el > 0) {
                isAnyPositive = true;
                break;
            }
        }
        return isAnyPositive;
    }

    public static boolean AllArePositive(int[] arr) {

        int count = 0;

        for (int el : arr) {
            if (el > 0) {
                count++;
            }
        }

        return count == arr.length;
    }
}
