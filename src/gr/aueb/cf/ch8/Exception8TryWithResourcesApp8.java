package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Exception8TryWithResourcesApp8 {

    public static void main(String[] args) {
        String num = "";

        try (Scanner in = new Scanner(System.in)) {
            while (!isInteger(num = in.nextLine())) {
                System.out.println("Please insert an int");
            }
            System.out.println(num);
        }
    }

    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
}
