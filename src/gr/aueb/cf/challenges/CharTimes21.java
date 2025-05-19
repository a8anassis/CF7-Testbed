package gr.aueb.cf.challenges;

/**
 * Γράψτε μία μέθοδο που δοσμένου ενός string s
 * ενός χαρακτήρα ch και ενός αριθμού n που συμβολίζει τους n πρώτους χαρακτήρες βρίσκει το πλήθος των
 * του string, να βρίσκει το πλήθος των φορών που εμφανίζεται ο χαρακτήρας ch,
 * στους πρώτους n χαρακτήρες του string s. Αν το n είναι μεγαλύτερο από το length του
 * String επιστρέφει 0.
 */
public class CharTimes21 {

    public static void main(String[] args) {
        String s = "asokasotaso";
        System.out.println(getCount(s, 'a', 8));
    }

    public static int getCount(String s, char ch, int n) {
        if (n > s.length()) return 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch) count++;
        }

        return count;
    }
}
