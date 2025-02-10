package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReluctantPattern {

    public static void main(String[] args) {
        String s = "login:alice;pass:12345;login:bob;pass:12345678;";

        Pattern pattern = Pattern.compile(".*?;");   // As little as possible -- reluctant
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
