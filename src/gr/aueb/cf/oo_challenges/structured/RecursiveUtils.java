package gr.aueb.cf.oo_challenges.structured;

public class RecursiveUtils {

    private RecursiveUtils() {

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
