package gr.aueb.cf.ch6;

/**
 * Finds the min and max of an array.
 */
public class Array10MinAndMax8 {

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
     * assuming that the first element is the min element
     * and then does  comparing.
     * @param arr   the initial input array.
     * @return  the position of the min element.
     */
    public static int getMinPosition(int[] arr) {

        if (arr == null || arr.length < 1) return -1;   // -1 is non-valid array position

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {   // starts with index 1 for optimization
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
     * assuming that the first element is the max element
     * and then does comparing.
     * @param arr   the initial input array.
     * @return  the position of the max element.
     */
    public static int getMaxPosition(int[] arr) {

        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {  // starts with index 1 for optimization
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
