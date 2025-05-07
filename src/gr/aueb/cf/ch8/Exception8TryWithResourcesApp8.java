package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exception8TryWithResourcesApp8 {

    public static void main(String[] args) {
        String num = "";

        try (Scanner in = new Scanner(new File("text.txt"))) {
            while (!isInteger(num = in.nextLine())) {
                System.out.println("Please insert an int");
            }
            System.out.println(num);
        } catch (FileNotFoundException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
        }
    }

    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
}
