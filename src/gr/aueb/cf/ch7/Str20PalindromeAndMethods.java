package gr.aueb.cf.ch7;

/**
 * Ελέγχει αν ένα String είναι παλινδρομικό.
 */
public class Str20PalindromeAndMethods {

    public static void main(String[] args) {
        String s1 = "AttAA";
        System.out.println(isPalindrome(s1));
    }

    /**
     * Επιστρέφει true αν ένα String είναι
     * παλινδρομικό, αλλιώς false.
     *
     * @param s     the input String.
     * @return      true, is the String is palindrome,
     *              false otherwise.
     */
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
