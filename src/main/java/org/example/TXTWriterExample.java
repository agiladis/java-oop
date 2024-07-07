package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class TXTWriterExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            // write to .txt file
            writer.write("Hello world\n");
            writer.write("This is a simple text file.\n");
            writer.write("We are writing this using FileWriter.\n");

            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
