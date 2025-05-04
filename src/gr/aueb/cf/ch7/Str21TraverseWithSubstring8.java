package gr.aueb.cf.ch7;

public class Str21TraverseWithSubstring8 {

    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Bus";
        printSpaced(s);
    }

    public static void printSpaced(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1) + " ");
        }
    }
}
