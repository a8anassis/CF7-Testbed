package gr.aueb.cf.ch9;

import javax.swing.text.Style;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Scanner;

public class File1Read {

    public static void main(String[] args) throws IOException {
        String file = "C:/Users/a8ana/OneDrive/Υπολογιστής/tmp/test.txt";

        fileReaderRead(file);
        System.out.println();
        scannerRead(file);
        bufferedReaderRead(file);
    }

    /**
     * Char-by-char read. Low performance.
     * @param file
     * @throws IOException
     */
    public static void fileReaderRead(String file) throws IOException {

        // try with resources
        try (FileReader fr = new FileReader(file)) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "fileReaderRead" + e);
        }
//        No need for finally if we try-with-resources
//        finally {
//            try {
//                fr.close();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
    }

    // For structured text with primitives - > int double string structured
    public static void scannerRead(String file) throws IOException {
       // try (Scanner sc = new Scanner(new File(file))) {
        try (Scanner sc = new Scanner(new File(file), StandardCharsets.UTF_8)) {

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "," + e);
            throw e;
        }
    }

    // for large texts, powerful read-line
    public static void bufferedReaderRead(String file) throws IOException {

//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;

            // Powerful read-line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "," + e);
            throw e;
        }
    }
}
