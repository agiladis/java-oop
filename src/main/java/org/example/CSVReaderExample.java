package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {
    public static void main(String[] args) {
        String csvFile = "example.csv";
        BufferedReader reader = null;
        String line = "";
        String delimiter = ",";

        try {
            reader = new BufferedReader(new FileReader(csvFile));
            while ((line = reader.readLine()) != null) {
                // comma sebagai delimiter
                String[] data = line.split(delimiter);

                // menampilkan data
                System.out.println("Name: " + data[0] + ", Age: " + data[1] + ", Country: " + data[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
