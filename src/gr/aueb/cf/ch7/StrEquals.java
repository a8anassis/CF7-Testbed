package gr.aueb.cf.ch7;

public class StrEquals {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "ATHENS";

        boolean equal1 = s1.equals(s2);             // true
        boolean equal2 = s1.equals(s3);             // false
        boolean equal3 = s1.equalsIgnoreCase(s3);   // true

        boolean equal4 = s1.toUpperCase().equals(s3.toUpperCase()); // normalise to uppercase
    }
}
