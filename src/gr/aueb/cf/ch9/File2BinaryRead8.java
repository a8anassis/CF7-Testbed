package gr.aueb.cf.ch9;

import java.io.*;
import java.time.LocalDateTime;

public class File2BinaryRead8 {

    public static void main(String[] args) {

    }

    public static void binaryInputReadWrite(String inputFile, String outputFile)
            throws IOException {
        int bufferSize = 1024;             // 1 KB buffer
        byte[] buffer = new byte[bufferSize];
        int bytesRead;

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);  // Write the bytes read from input to output
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "binaryInputReadWrite\n" + e);
            throw e;
        }
    }

    public static void bufferedReadWrite(String inputFile, String outputFile) throws IOException {
        int bufferSize = 4096;             // 4 KB buffer

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile), bufferSize);
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile), bufferSize)) {

            byte[] buffer = new byte[bufferSize];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);  // Write the bytes read from input to output
            }

            System.out.println("File copied successfully using buffered streams!");

        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "binaryInputReadWrite\n" + e);
            throw e;
        }
    }
}
