package gr.aueb.cf.ch7;

public class Str16Split8 {

    public static void main(String[] args) {
        String s = "Athens:Uni:of:Econ:and:Business";

        String[] tokens = s.split(":"); // regex

        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }
}
