package gr.aueb.cf.ch9;

import java.io.*;
import java.time.LocalDateTime;

public class File3FileWriterPrintStream8 {

    public static void main(String[] args) {


    }

    public static void fileWriter(String file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {  // true for append
            fw.write("Appended using FileWriter\n");
            fw.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void printStream(String file) throws FileNotFoundException {
        try (PrintStream ps = new PrintStream(file)) {
//        try (PrintStream ps = new PrintStream(new FileOutputStream(file, true))) {
            ps.println("Using PrintStream");
            ps.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }
}
