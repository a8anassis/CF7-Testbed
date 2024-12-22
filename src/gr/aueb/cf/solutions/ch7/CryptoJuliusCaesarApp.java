package gr.aueb.cf.solutions.ch7;

/**
 *
 */
public class CryptoJuliusCaesarApp {

    public static void main(String[] args) {
        String s = "BUZZ";
        //String s = "abc";
        final int KEY = 3;

        String encrypted = encrypt(s, KEY);
        System.out.println(encrypted);

        String decrypted = decrypt(encrypted, KEY);
        System.out.println(decrypted);
    }

    public static String encrypt(String s, int key) {
        StringBuilder encrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)) encrypted.append(cipher(ch, key));
            else encrypted.append(ch);
        }

        return encrypted.toString();
    }

    public static String decrypt(String s, int key) {
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isAlphabetic(ch)) decrypted.append(decipher(ch, key));
            else decrypted.append(ch);
        }

        return decrypted.toString();
    }

    public static char cipher(char ch, int key) {
        int m, c;
        int base = 'A';
        int latinCount = 26;

        m = ch - base;
        c = (m + key) % latinCount;

        return (char) (c + base);
    }

    public static char decipher(char ch, int key) {
        int m, c;
        int base = 'A';
        int latinCount = 26;

        c = ch - base;

        m = ((c - key) + latinCount) % latinCount;
        return (char) (m + base);
    }
}
