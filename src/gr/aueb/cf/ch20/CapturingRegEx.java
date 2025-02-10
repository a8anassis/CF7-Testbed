package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingRegEx {

    public static void main(String[] args) {
        String s = "HelloWorld HelloWorld";

        Pattern pattern = Pattern.compile("(Hello)(World)");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.print(matcher.group(i) + " ");
            }
            System.out.println();
        }
    }
}
