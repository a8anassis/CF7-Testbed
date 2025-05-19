package gr.aueb.cf.challenges;

import java.nio.file.*;
import java.io.IOException;

public class StudentsCsvNio {
    public static void main(String[] args) {
        Path inputPath = Paths.get("grades.csv");
        Path outputPath = Paths.get("report_nio.txt");

        try {
            String content = Files.readString(inputPath);
            String[] lines = content.split("\n");

            StringBuilder report = new StringBuilder();
            report.append("Student Averages:\n");

            double classTotal = 0;
            int studentCount = 0;
            int highestGrade = 0;

            for (String line : lines) {
                String[] parts = line.split(",");
                String name = parts[0];
                int grade1 = Integer.parseInt(parts[1]);
                int grade2 = Integer.parseInt(parts[2]);
                int grade3 = Integer.parseInt(parts[3]);

                double average = (grade1 + grade2 + grade3) / 3.0;
                classTotal += average;
                studentCount++;

                // Track highest grade
                highestGrade = Math.max(highestGrade, grade1);
                highestGrade = Math.max(highestGrade, grade2);
                highestGrade = Math.max(highestGrade, grade3);

                report.append(String.format("%s: %.2f%n", name, average));
            }

            double classAverage = classTotal / studentCount;
            report.append(String.format("%nClass Average: %.2f%n", classAverage));
            report.append(String.format("Highest Grade: %d%n", highestGrade));

            Files.writeString(outputPath, report.toString(), StandardOpenOption.CREATE);

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}
