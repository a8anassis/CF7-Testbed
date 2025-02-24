package gr.aueb.cf.solutions.ch10;

/**
 * It finds the contiguous sub-array with the largest sum using Kadane's algorithm,
 * and in the following case {-2, 1, -3, 4, -1, 2, 1, -5, 4}, the maximum sum
 * sub-array is [4, -1, 2, 1] with a sum of 6.
 */
public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] maxSubArray = findMaxSubArray(arr);

        System.out.println("Maximum Sub Array:");
        for (int num : maxSubArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] findMaxSubArray(int[] arr) {
        int n = arr.length;
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        int start = 0, end = 0;
        int tempStart = 0;

        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

            if (arr[i] > maxEndingHere + arr[i]) {
                tempStart = i + 1;
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }

        // The result is the sub-array from start to end
        int[] result = new int[end - start + 1];
        System.arraycopy(arr, start, result, 0, result.length);

        return result;
    }
}
