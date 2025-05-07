package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exception9TryWithResourcesApp8 {

    public static void main(String[] args) {
        String num = "";
        File fd = new File("C:/tmp/test.txt");

        try (Scanner in = new Scanner(System.in);
             FileReader fr = new FileReader(fd)) {
            System.out.println(fr.read());
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
        }
    }

    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
}
