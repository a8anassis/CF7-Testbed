package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class File3FileWriterPrintStream8 {

    public static void main(String[] args) {
        File fd = new File("C:/tmp/file-writer.txt");
        try {
            bufferedWriter(fd);
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε. ");
        }
    }

    public static void printWriter(String file) throws IOException {
//        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8))) {
        try (PrintWriter ps = new PrintWriter(file)) {
            ps.println("Using PrintWriter");
            ps.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }


    public static void printStream(String file) throws IOException {
        //try (PrintStream ps = new PrintStream(file, StandardCharsets.UTF_8)) {
            try (PrintStream ps = new PrintStream(new FileOutputStream(file, true), false, StandardCharsets.UTF_8)) {
            ps.println("Using PrintStream");
            ps.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void bufferedWriter(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            // BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),
            //       StandardCharsets.UTF_8));
//            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true),
//                    StandardCharsets.UTF_8))) {

                bw.write("Coding!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void fileWriter(File file) throws IOException {
        //try (FileWriter fw = new FileWriter(file, true)) {
        try (FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8, true)) {
            fw.write("Coding Factory\n");
            fw.flush();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }




}
