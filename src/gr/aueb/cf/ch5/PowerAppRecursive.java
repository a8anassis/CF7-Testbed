package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {

    }

    /**
     * Recursive version of power app.
     *
     * @param a     the base.
     * @param n     the power.
     * @return      the base raised to the power.
     */
    public static int power(int a, int n) {
//        if (n == 0) return 1;
//        return power(a, n-1) * a;

        return (n == 0) ? 1 : power(a, n-1) * a;
    }
}
