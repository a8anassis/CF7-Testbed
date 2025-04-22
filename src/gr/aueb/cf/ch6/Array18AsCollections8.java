package gr.aueb.cf.ch6;

import java.util.Arrays;

public class Array18AsCollections8 {

    public static void main(String[] args) {
        int[] arr = {1, 11, 21, 31, 8, 9};
    }


    // Filtering
    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];  // empty array

        int count = 0;
        int[] temp = new int[arr.length]; // Worst case: all even

        for (int num : arr) {
            if (num % 2 == 0) temp[count++] = num;
        }
        return Arrays.copyOf(temp, count); // Trim to actual size
    }

    // Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    // Reducing
    public static int sum(int[] arr) {
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }

        return sum;
    }

    public static double avg(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    // Aggregates
    public static boolean anyEven(int[] arr) {
//        boolean isAnyEven = false;
//
//        for (int el : arr) {
//            if (el % 2 == 0) {
//                isAnyEven = true;
//                break;
//            }
//        }
//        return isAnyEven;

        for (int num : arr) {
            if (num % 2 == 0) return true;  // Early exit
        }
        return false;   // two exit points, not that testable
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
            //if (count > 2) return true; // early exit
        }

        //return false;
        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
                // return true;
            }
        }

        //return false;
        return count >= 1;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
//        int[] end ings = new int[10];
//        boolean isSameEnding = false;
//
//        for (int num : arr) {
//            endings[num % 10]++;
//        }
//        //        for (int i = 0; i < arr.length; i++) {
////            endings[arr[i] % 10]++;
////        }
//
//        for (int count : endings) {
//            if (count >= 3) {
//                isSameEnding = true;
//                break;
//            }
//        }
//        return isSameEnding;

        int[] endings = new int[10];
        for (int num : arr) {
            if (++endings[num % 10] >= 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean AllAreEven(int[] arr) {
        //return getEvens(arr).length == arr.length;

//        boolean allEven = false;
//        int count = 0;
//
//        for (int el : arr) {
//            if (el % 2 == 0) count++;
//        }
//
//        return count == arr.length;

        for (int num : arr) {
            if (num % 2 != 0) {  // Found odd number
                return false;
            }
        }
        return arr.length > 0;  // Returns true only if non-empty and all even
    }
}
