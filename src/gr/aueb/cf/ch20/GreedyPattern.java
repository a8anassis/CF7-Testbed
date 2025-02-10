package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyPattern {

    public static void main(String[] args) {
        String s = "login;alice;pass;12345;";

        Pattern pattern = Pattern.compile(".*;");   // As much as possible -- greedy
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
