package gr.aueb.cf.solutions.ch9;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class CopyAttachedWithMetadata {

    public static void main(String[] args) {
        String inputPath = "C:/tmp/";
        String outPath = "C:/tmp/";
        String userInputFile;
        String inputFile;
        String outFile;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert input file name");
        userInputFile = in.nextLine();

        inputFile = inputPath + userInputFile;
//        outFile = outPath +  LocalDateTime.now().toString().replace(":", "_") + userInputFile;
        outFile = outPath +  UUID.randomUUID().toString().replace(":", "_") + userInputFile;

        File inFd = new File(inputFile);
        File outFd = new File(outFile);
        byte[] buf = new byte[4096];
        int byteCounter;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFd));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outFd))) {
            while ((byteCounter = bis.read(buf)) != -1) {
                bos.write(buf, 0, byteCounter);
            }
            System.out.println(inFd.getAbsolutePath());
            System.out.println(outFd.getAbsolutePath());

            String extension = "";
            int dotIndex = inputFile.lastIndexOf('.');
            if (dotIndex > 0 && dotIndex < inputFile.length() - 1) {
                extension = inputFile.substring(dotIndex + 1);
            }
            System.out.println(extension);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
