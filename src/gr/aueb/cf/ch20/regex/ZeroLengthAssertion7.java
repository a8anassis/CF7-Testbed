package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroLengthAssertion7 {

    public static void main(String[] args) {
        String s = "BCd0";

        Pattern pattern = Pattern.compile("^(?=.*?[a-z]).{4,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
