package gr.aueb.cf.ch6;

public class Array11MinMax8 {

    public static void main(String[] args) {
        int[] grades = {1, 6, 3, 8, 5};
        int minPosition;
        int maxPosition;

        minPosition = getMinPosition(grades);
        maxPosition = getMaxPosition(grades);

        System.out.printf("MinValue: %d, Min Position: %d\n", grades[minPosition], (minPosition + 1));
        System.out.printf("MaxValue: %d, Max Position: %d", grades[maxPosition], (maxPosition + 1));
    }

    /**
     * Finds the minimum element of an array and returns
     * its position in the array. The algorithm starts by
     * assuming that the first element is Integer MAX VALUE
     * and then does comparing.
     * @param arr   the initial input array.
     * @return  the position of the min element.
     */
    public static int getMinPosition(int[] arr) {

        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {  // starts with index 0
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    /**
     * Finds the maximum element of an array and returns
     * its position in the array. The algorithm starts by
     * assuming that the first element is the Integer MIN VALUE
     * and then does comparing.
     * @param arr   the initial input array.
     * @return  the position of the max element.
     */
    public static int getMaxPosition(int[] arr) {

        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }

    /**
     * Overloaded.Challenge.
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int getMinPosition(int[] arr, int low, int high) {
        if (arr == null || arr.length < 1) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int minPosition = low;
        int minValue = arr[low];

        for (int i = low; i <= high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
