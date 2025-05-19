package gr.aueb.cf.challenges;

/**
 * 1.	Γράψτε μία μέθοδο που δοσμένου ενός string s και
 * ενός ακεραίου n επιστρέφει ένα string που αποτελεί επανάληψη του s , n φορές
 */
public class RepeatedString1 {

    public static void main(String[] args) {
        String s = "aako";
        //System.out.println(getRepeated1(s, 2));
        System.out.println(getRepeated2(s, 10));
    }

    public static String getRepeated1(String s, int times) {
        return s.repeat(times);
    }

    public static String getRepeated2(String s, int n) {
        int times = (int) Math.ceil((double) n / s.length());
        return s.repeat(times);
    }
}
