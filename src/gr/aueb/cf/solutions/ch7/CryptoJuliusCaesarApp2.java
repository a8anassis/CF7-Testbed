package gr.aueb.cf.solutions.ch7;

public class CryptoJuliusCaesarApp2 {

    public static void main(String[] args) {
        //String s = "JULIus CAESAR";
        String s = "abc";
        final int KEY = 1;

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

            if (!Character.isLetter(ch)) {
                encrypted.append(ch);
            } else {
                encrypted.append(cipher(ch, key));
            }
        }

        return encrypted.toString();
    }

    public static String decrypt(String s, int key) {
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch != ' ') {
                decrypted.append(decipher(ch, key));
            } else {
                decrypted.append(ch);
            }
        }
        return decrypted.toString();
    }

    public static char cipher(char ch, int key) {
        int m, c;
        int base = Character.isUpperCase(ch) ? 'A' : 'a';

        m = ch - base;
        c = (m + key) % 26;
        return (char) (c + base);
    }

    public static char decipher(int ch, int key) {
        int m, c;
        int base = Character.isUpperCase(ch) ? 'A' : 'a';

        c = ch - base;
        m = ((c - key) + 26) % 26;
        return (char) (m + base);
    }
}
