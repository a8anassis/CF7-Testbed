package gr.aueb.cf.ch7;

public class Str20PalindromeAndMethods {

    public static void main(String[] args) {

        String s1 = "AttAA";
        System.out.println(isPalindrome(s1));

    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
