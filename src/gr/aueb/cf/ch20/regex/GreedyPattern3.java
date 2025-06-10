package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyPattern3 {

    public static void main(String[] args) {
        String s = "login;alice;pass;12345;";

        Pattern pattern = Pattern.compile(".*;");   // As much as possible -- greedy
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
