package gr.aueb.cf.ch7;

public class Str3Immutable8 {

    public static void main(String[] args) {
        String str1 = "Athens";
        String str2 = str1;

        str2 = "Paris";     // Now str1 = Athens and str2 = Paris
        str2 = "London";    // Now "Paris" is garbage in heap and collected by GC
    }
}
