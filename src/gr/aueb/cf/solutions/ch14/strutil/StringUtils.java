package gr.aueb.cf.solutions.ch14.strutil;

public class StringUtils {

    private StringUtils() {

    }

    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public String toUppercase(String input) {
        return input.toUpperCase();
    }

    public boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }
}
