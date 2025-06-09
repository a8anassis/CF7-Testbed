package gr.aueb.cf.oo_challenges.structured;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {

    private Palindrome() {

    }

    public static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static boolean isPalindrome(List<Integer> numbers) {
        List<Integer> reversed = new ArrayList<>(numbers);
        Collections.reverse(reversed);
        return numbers.equals(reversed);
    }

    public static boolean isPalindrome(int[] arr) {
//        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//            if (arr[i] != arr[j]) {
//                return false;
//            }
//        }
//
//        return true;

        int n = arr.length;
        return IntStream
                .range(0, n / 2)
                .allMatch(i -> arr[i] == arr[n - 1 - i]);
    }
}
