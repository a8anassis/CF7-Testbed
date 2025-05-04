package gr.aueb.cf.ch7;

public class Str6IndexOfSubstring8 {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("oding");          // 1
        System.out.println(positionOfo);
        int positionOfSecondo = cf.indexOf("o", 2);     //11
        System.out.println(positionOfSecondo);
        int lastPositionOfo = cf.lastIndexOf("o");      //11
        System.out.println(lastPositionOfo);
//
        String cf2 = cf.substring(1);                   // "oding Factory"
        System.out.println(cf2);
        String slice = cf.substring(1, 3);              // od
        System.out.println(slice);

        if (cf.startsWith("Coding")) {
            System.out.println("Starting..!");
        } else {
            System.out.println("Not Starting..");
        }

        char ch = cf.charAt(0);    // C
    }
}
