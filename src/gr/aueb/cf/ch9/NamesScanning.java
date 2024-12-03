package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει από ένα αρχείο δεδομένα
 */
public class NamesScanning {

    public static void main(String[] args) {
        String inFilePath = "C:/tmp/names.txt";
        String outFilePath = "C:/tmp/names-formatted.txt";
        String line;
        String[] tokens;
        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
//                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
                printFormatted(ps, tokens);
                printFormatted(System.out, tokens);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
     }

     public static void printFormatted(PrintStream ps, String[] tokens) {
         ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
     }
}
