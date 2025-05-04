package gr.aueb.cf.ch7;

/**
 * Strings are cached in Intern Area.
 * Stored only once in
 * (SCP - String Constant Pool). This is
 * done for efficiency and can be done in
 * secure manner because strings are immutable.
 *
 */
public class Str2Immutable8 {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory"; // s1 remains unchangeable.
        s1 = "Athens";
    }
}
