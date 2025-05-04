package gr.aueb.cf.ch7;

/**
 * String Declare and populate.
 */
public class String1Init8 {

    public static void main(String[] args) {
        String s = "Athens";
        String str = new String("University");  // Δε συνηθίζεται. Είναι περιττό

        System.out.println(s);
        System.out.println("Length: " + s.length());
        System.out.printf("City: %s ", s);
    }
}
