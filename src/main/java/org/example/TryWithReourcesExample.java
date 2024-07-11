package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithReourcesExample {
    public static void main(String[] args) {
        // example 1 resources
        try (Scanner scanner = new Scanner(new File("Test.txt"))){
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // example more than 1 resource
        try (Scanner scanner = new Scanner(new File("testRead.txt")); PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
