package gr.aueb.cf.ch5;

public class PowerApp {

    public static void main(String[] args) {

    }

    /**
     * Calculates a^n.
     * Delegation / Forwarding.
     *
     * @param a     the base.
     * @param n     the power.
     * @return      the base raised to the power.
     */
    public static long pow(long a, long n) {
//        long result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result = result * a;
//        }
//        return result;
        return (long) Math.pow(a, n);
    }
}
