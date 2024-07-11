package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithReourcesExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("Test.txt"))){
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
