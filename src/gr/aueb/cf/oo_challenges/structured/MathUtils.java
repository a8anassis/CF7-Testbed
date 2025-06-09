package gr.aueb.cf.oo_challenges.structured;

public class MathUtils {

    private MathUtils() {

    }

    public static void printPrimes(int num) {
        boolean isPrime;

        for (int i = 2; i <= num; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i + " is prime");
        }
    }
}
