package gr.aueb.cf.ch7;

public class Str7Replace8 {

    public static void main(String[] args) {
        String s = "Athens-Athens";
        String replaced = s.replace("A", "a");  // empty 2nd param is delete
        System.out.println(replaced);
    }
}
