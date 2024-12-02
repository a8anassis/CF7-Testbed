package gr.aueb.cf.solutions.ch7;

public class CryptoJuliusCaesarApp2 {

    public static void main(String[] args) {
        String s = "JULIus CAESAR";
        //String s = "abc";
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

        m = (Character.isUpperCase(ch)) ? ch - 65 : (Character.isLowerCase(ch)) ? ch - 97 : 0;
        c = (m + key) % 26;
        return (Character.isUpperCase(ch)) ? (char) (c + 65) : (Character.isLowerCase(ch)) ? (char) (c + 97) : 0;
    }

    public static char decipher(int ch, int key) {
        int m, c;

        c = (Character.isUpperCase(ch)) ? ch - 65 : (Character.isLowerCase(ch)) ? ch - 97 : 0;
        m = ((c - key) + 26) % 26;
        return (Character.isUpperCase(ch)) ? (char) (m + 65) : (Character.isLowerCase(ch)) ? (char) (m + 97) : 0;
    }
}
