package gr.aueb.cf.solutions.ch6;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class LottoApp {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(new File("C:/tmp/lotto5in.txt"));
             PrintStream ps = new PrintStream("C:/tmp/lotto5out.txt", StandardCharsets.UTF_8)) {

            final int LOTTO_SIZE = 6;
            int[] inputNumbers = new int[49];
            int pivot = 0;
            int[] result = new int[LOTTO_SIZE];
            int num;
            int window;

            while ((num = in.nextInt()) != -1 && pivot <= 48) {
                inputNumbers[pivot++] = num;
                //pivot++;
            }

            int[] numbers = Arrays.copyOfRange(inputNumbers, 0, pivot);
            Arrays.sort(numbers);

            window = pivot - LOTTO_SIZE;
            for (int i = 0; i <= window; i++) {
                for (int j = i + 1; j <= window + 1; j++) {
                    for (int k = j + 1; k <= window + 2; k++) {
                        for (int l = k + 1; l <= window + 3; l++) {
                            for (int m = l + 1; m <= window + 4; m++) {
                                for (int n = m + 1; n <= window + 5; n++) {
                                    result[0] = numbers[i];
                                    result[1] = numbers[j];
                                    result[2] = numbers[k];
                                    result[3] = numbers[l];
                                    result[4] = numbers[m];
                                    result[5] = numbers[n];

                                    if (!isEvenGE(result, 5) && !isOddGE(result, 5) && !sameTen(result, 3)
                                            && !sameEnding(result, 3) && !consecutive(result)) {
                                        ps.printf("%d %d %d %d %d %d\n",
                                                result[0], result[1], result[2], result[3], result[4], result[5]);
                                        System.out.printf("%d %d %d %d %d %d\n",
                                                result[0], result[1], result[2], result[3], result[4], result[5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns true if the number of evens is greater than or
     * equal to a threshold limit.
     *
     * @param arr
     *          the input array.
     * @param threshold
     *          the upper limit of the constraint.
     * @return
     *          true, if the number of evens is greater
     *          than or equal to a threshold limit, false
     *          otherwise.
     */
    public static boolean isEvenGE(int[] arr, int threshold) {
        long evenCount = 0;

//        for (int num : arr) {
//            if (num % 2 == 0) even++;
//        }
//
//        return even > threshold;
        evenCount = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .count();

        return evenCount >= threshold;
    }

    /**
     * Returns true if the number of odds is greater than or
     * equal to a threshold limit.
     *
     * @param arr
     *          the input array.
     * @param threshold
     *          the upper limit of the constraint.
     * @return
     *          true, if the number of odds is greater
     *          than or equal to a threshold limit, false
     *          otherwise.
     */
    public static boolean isOddGE(int[] arr, int threshold) {
        long oddsCount = 0;

//        for (int num : arr) {
//            if (num % 2 != 0) odds++;
//        }
//
//        return odds >= threshold;
        oddsCount = Arrays.stream(arr)
                .filter(num -> num % 2 != 0)
                .count();

        return oddsCount >= threshold;
    }

    /**
     * Returns true if threshold or more numbers are in the
     * same ten.
     *
     * @param arr
     *      the input array.
     * @param threshold
     *      the threshold.
     * @return
     *      true, if GE (Greater or Equal) to threshold numbers
     *      are in the same ten.
     */
    public static boolean sameTen(int[] arr, int threshold) {
        int[] ten = new int[5];

        for (int num : arr) {
             ten[num/10]++;
        }

        return Arrays.stream(ten).anyMatch(t -> t >= threshold);
    }

    /**
     * Returns true if at least three numbers are consecutive.
     *
     * @param arr
     *      the input array.
     * @return
     *      true, if at least three numbers are consecutive.
     */
    public static boolean consecutive(int[] arr) {
        int consecutiveCount = 0;

        for (int i = 0; i <= 3; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                consecutiveCount++;
                break;
            }
        }

        return consecutiveCount >= 1;
    }

    /**
     * Returns true if threshold or more numbers have the same ending.
     *
     * @param arr
     *      the input array.
     * @param threshold
     *      the threshold.
     * @return
     *      true, if GE (Greater or Equal) to threshold numbers
     *      have the same ending.
     */
    public static boolean sameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];

        for (int num : arr) {
            endings[num % 10]++;
        }

        return Arrays.stream(endings).anyMatch(e -> e >= threshold);
    }
}
