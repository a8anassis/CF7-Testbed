package gr.aueb.cf.challenges;

/**
 * 5.	Έστω η τιμή μίας μετοχής που μπορεί να πέσει κάτω από μία τιμή βάσης ή
 * να ανέβει πάνω από την τιμή βάσης. Έστω ένας πίνακας με τις κινήσεις της μετοχής,
 * για παράδειγμα [1, -1, -1, -1, 1, 1, 1, 1, -1, -1] όπου ξεκινώντας από την τιμή
 * βάσης φαίνεται από τον πίνακα ότι αρχικά η μετοχή ανέβηκε κατά μία μονάδα,
 * στη συνέχεια ξαναπήγε στην τιμή βάσης και μετά υποχώρησε διαδοχικά κατά δύο μονάδες
 * ξανανέβηκε στην τιμή βάσης μετά αυξήθηκε κατά δύο και ξαναπέσε στην τιμή βάσης.
 * Γράψτε μία μέθοδο που επιστρέφει ένα ακέραιο που αντιπροσωπεύει τον αριθμό των φορών
 * που η μετοχή έπεσε κάτω από την τιμή βάσης. Στο παράδειγμα επιστρέφει 1.
 */
public class StockBelowZero {

    public static void main(String[] args) {

    }

    public static int countTimesBelowBase(int[] movements) {
        int currentValue = 0, count = 0;
        boolean isBelow = false;

        for (int move : movements) {
            currentValue += move;
            if (currentValue < 0) isBelow = true;
            if (isBelow && currentValue == 0) {
                count++;
                isBelow = false;
            }
        }
        return count;
    }

    public static int countTimesBelowBase(String[] movements) {
        int currentPrice = 0;
        int count = 0;
        boolean isBelow = false;

        for (String move : movements) {
            if (move.equals("MU")) {
                currentPrice += 1;
            } else if (move.equals("MD")) {
                currentPrice -= 1;
            }

            if (currentPrice < 0) {
                isBelow = true;  // Stock fell below base
            }

            if (isBelow && currentPrice == 0) {
                count++;         // Stock returned to base after a fall
                isBelow = false;
            }
        }

        return count;
    }

}
