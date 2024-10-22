package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo.
 */
public class BigIntApp {

    public static void main(String[] args) {
        // Declarations and Initializations
        BigInteger bigNum1 = new BigInteger("12345678998765432199990");
        BigInteger bigNum2 = new BigInteger("2341237896555555588");
        BigInteger result;

        // Commands
        result = bigNum1.add(bigNum2);

        // Printing the results
        System.out.printf("%,d", result);
    }
}
