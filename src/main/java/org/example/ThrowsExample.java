package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsExample {
    public static void writeToFile (String message) throws IOException, IllegalArgumentException {
        if (message == null) throw new IllegalArgumentException("message cannot be null");
        BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
        bw.write(message);
        bw.close();
    }

    public static void write() throws IOException, IllegalArgumentException {
        String message = null; // example String null
        writeToFile(message);
    }

    public static void main(String[] args) {
        try {
            write();
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
