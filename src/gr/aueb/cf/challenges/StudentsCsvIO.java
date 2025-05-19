package gr.aueb.cf.challenges;

import java.io.*;

public class StudentsCsvIO {
    public static void main(String[] args) {
        String inputFile = "C:/tmp/grades.csv";
        String outputFile = "C:/tmp/report_io.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             PrintStream pw = new PrintStream(outputFile)) {

            String line;
            double classTotal = 0;
            double classAverage = 0;
            double average = 0;
            int studentCount = 0;
            int highestGrade = 0;
            int grade1;
            int grade2;
            int grade3;

            pw.println("Student Averages:");

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                grade1 = Integer.parseInt(parts[1]);
                grade2 = Integer.parseInt(parts[2]);
                grade3 = Integer.parseInt(parts[3]);

                average = (grade1 + grade2 + grade3) / 3.0;
                classTotal += average;
                studentCount++;

                // Track highest grade
                if (grade1 > highestGrade) highestGrade = grade1;
                if (grade2 > highestGrade) highestGrade = grade2;
                if (grade3 > highestGrade) highestGrade = grade3;

                pw.printf("%s: %.2f%n", name, average);
            }

            classAverage = classTotal / studentCount;
            pw.printf("%nClass Average: %.2f%n", classAverage);
            pw.printf("Highest Grade: %d%n", highestGrade);

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}
