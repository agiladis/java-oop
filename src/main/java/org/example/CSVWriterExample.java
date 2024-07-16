package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriterExample {
    public static void main(String[] args) {
        String csvFile = "example.csv";
        FileWriter writer = null;

        try {
            writer = new FileWriter(csvFile);

            // menulis header
            writer.append("Name, Age, Country\n");

            // menulis data
            writer.append("Alice, 30, USA\n");
            writer.append("Bob, 25, UK\n");
            writer.append("Charlie, 35, Canada\n");

            System.out.println("CSV file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
