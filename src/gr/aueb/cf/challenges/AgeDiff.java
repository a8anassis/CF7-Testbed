package gr.aueb.cf.challenges;

/**
 * 4.	Έστω ένας πίνακας ακεραίων έστω ages που συμβολίζει ηλικίες (σε έτη),
 * και έστω η ηλικία age (σε έτη) ενός χαρακτήρα.
 * Γράψτε μία μέθοδο που λαμβάνει ως είσοδο τον πίνακα ages και την ηλικία age και
 * επιστρέφει την ηλικιακή διαφορά του χαρακτήρα από τη μέγιστη ηλικία του πίνακα.
 * Αν δεν υπάρχει ηλικιακή διαφορά επιστρέφει 0.
 */
public class AgeDiff {

    public static void main(String[] args) {

    }

    public static int calculateAgeDifference(int[] ages, int age) {
        if (ages == null || ages.length == 0) {
            return 0;  // Αν ο πίνακας είναι άδειος, επιστροφή 0
        }

        int maxAge = ages[0];
        for (int a : ages) {
            if (a > maxAge) {
                maxAge = a;  // Ενημέρωση της μέγιστης ηλικίας
            }
        }

        int difference = maxAge - age;
        return (difference > 0) ? difference : 0;  // Επιστροφή διαφοράς ή 0
    }
}
