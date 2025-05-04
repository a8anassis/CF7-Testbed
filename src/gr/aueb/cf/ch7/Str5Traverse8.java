package gr.aueb.cf.ch7;

/**
 * Traverses one-by-one all string chars.
 * Δεν μπορούμε με enhanced for γιατί έχουμε
 * κλάση, όχι πίνακα.
 */
public class Str5Traverse8 {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
