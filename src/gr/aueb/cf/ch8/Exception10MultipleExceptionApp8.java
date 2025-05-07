package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exception10MultipleExceptionApp8 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/tmp/file.txt");
        int num;
        try (Scanner in = new Scanner(file)) {
            char ch = (char) System.in.read();
            if (!in.hasNextInt()) {
                System.err.println("Error in reading  ...");
                System.exit(1);
            }
            num = in.nextInt();
            System.out.println(num);
        } catch (FileNotFoundException e) {
            System.err.println(LocalDateTime.now() + "file\n"  + e);
            //e.printStackTrace();
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "io\n"  + e);
            // e.printStackTrace();
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "Generic\n"  + e);
            // e.printStackTrace();
        }
    }
}
