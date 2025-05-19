package gr.aueb.cf.challenges;

/**
 * Γράψτε μία μέθοδο που δοσμένου ενός string s
 * ενός χαρακτήρα ch και ενός αριθμού n που συμβολίζει τους n πρώτους χαρακτήρες βρίσκει το πλήθος των
 * του string, να βρίσκει το πλήθος των φορών που εμφανίζεται ο χαρακτήρας ch,
 * στους πρώτους n χαρακτήρες του string s. Αν το n είναι μεγαλύτερο από το length
 * του String, το string θα πρέπει να γίνεται repeat ώστε το τελικό μήκος του string
 * να είναι αμέσως μεγαλύτερο από το μήκος του n.
 */
public class CharTimes22 {

    public static void main(String[] args) {
        String s = "aso";
        System.out.println(getCount(s, 'a', 16));
    }

    public static int getCount(String s, char ch, int n) {
        String repeatedString = "";

        if (n > s.length()) {
            int repeatedTimes = (int) Math.ceil((double) n / s.length());
            repeatedString = s.repeat(repeatedTimes);   // slow due to concat
        } else repeatedString = s;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (repeatedString.charAt(i) == ch) count++;
        }

        return count;
    }

    public static int getCount2(String s, char ch, int n) {
        int countInOneCycle = 0;
        int length = s.length();

        // Count occurrences of 'ch' in one full cycle of 's'
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ch) {
                countInOneCycle++;
            }
        }

        // Number of full cycles in 'n' steps
        int fullCycles = n / length;
        int totalCount = fullCycles * countInOneCycle;

        // Remaining steps after full cycles
        int remainingSteps = n % length;

        // Count 'ch' in the remaining steps
        for (int i = 0; i < remainingSteps; i++) {
            if (s.charAt(i) == ch) {
                totalCount++;
            }
        }

        return totalCount;
    }
}
