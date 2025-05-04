package gr.aueb.cf.ch7;

import java.util.regex.Pattern;

public class Str15EmptyAndNull8 {

    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";

        if (s1 == null) {
            System.out.println("is null");
        } else {
            System.out.println(s1.length());
        }

        if (s2.isEmpty()) {
            System.out.println("is empty");
        } else {
            System.out.println(s2);
        }
    }
}
