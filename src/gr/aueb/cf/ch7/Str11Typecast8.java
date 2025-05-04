package gr.aueb.cf.ch7;

import java.math.BigInteger;

/**
 * Typecasts from and to {@link String}.
 */
public class Str11Typecast8 {

    public static void main(String[] args) {
        String s = "Athens";
        String intStr = "8";
        double d = 3.5;

        String str = String.valueOf(d);

        BigInteger bigInt = new BigInteger("123456789");
        String strBig = bigInt.toString();
    }
}
