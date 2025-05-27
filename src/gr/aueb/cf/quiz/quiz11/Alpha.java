package gr.aueb.cf.quiz.quiz11;

public class Alpha {
    protected static String s = " ";

    public Alpha() {
        s += "alpha ";
    }


    public static String getS() {
        return s;
    }

    public static void setS(String s) {
        Alpha.s = s;
    }
}

