package gr.aueb.cf.ch7;

public class Str13LowerUpper8 {

    public static void main(String[] args) {
        String str1 = "Athens";
        String str2 = "ATHENS";

        String upper = str1.toUpperCase();
        String lower = str2.toLowerCase();

        boolean areEqual = str1.toUpperCase().equals(str2.toUpperCase());   // as equals
    }
}
