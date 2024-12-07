package gr.aueb.cf.solutions.ch6;

import java.util.Arrays;
import java.util.Comparator;

public class MaxCarsCh6App {

    public static void main(String[] args) {
        int[][] arr = { {1012, 1056}, {1022, 1023}, {1317, 1417}, {1025, 1035}, {1027, 1034}};
        int[][] transformed;

        transformed = transformArray(arr);
        sortByTime(transformed);

        for (int[] row : transformed) {
            System.out.print(row[0] + " ");
            System.out.println(row[1]);
        }

        System.out.println("Max Concurrent Cars in Garage: " + getMaxConcurrentCars(transformed));
    }

    public static int[][] transformArray(int[][] arr) {
        int[][] transformed = new int[arr.length*2][2];

        for (int i = 0; i < arr.length; i++) {
                transformed[i*2][0] = arr[i][0];
                transformed[i*2][1] = 1;
                transformed[i*2+1][0] = arr[i][1];
                transformed[i*2+1][1] = 0;
        }

        return transformed;
    }

    public static void sortByTime(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] a) -> a[0]));
    }

    /**
     * Returns the number of cars that are parked
     * during the same time interval.
     *
     * @param arr   the source array with arrivals and departures
     * @return      the concurrently parked cars
     */
    public static int getMaxConcurrentCars(int[][] arr) {
        int count = 0;
        int maxCount = 0;

        for (int[] ints : arr) {
            if (ints[1] == 1){
                count++;
                if (count > maxCount) maxCount = count;
            }
            else count--;
        }

        return maxCount;
    }
}
