package gr.aueb.cf.ch7;

public class Str17Format8 {

    public static void main(String[] args) {
        String s = "Athens";
        int num = 21;

        String formatted = String.format("%s:%d", s, num);
        System.out.println(formatted);
    }
}
