package gr.aueb.cf.ch8;

public class Exception5NullPointerExceptionApp8 {

    public static void main(String[] args) {
        String s = getNull();

        if (s == null) {
            System.out.println("String is null");
            System.exit(1);
        }

        System.out.println(s);

    }

    public static String getNull() {
        return null;    // returns null string
    }
}
