package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // without lambda
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println("---------- TANPA LAMBDA ----------");
        for (String name : names) {
            System.out.println(name);
        }

        // with lambda
        List<String> items = Arrays.asList("Chair", "Bed", "Television");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("---------- DENGAN LAMBDA ----------");
        items.forEach(name -> System.out.println(name));
    }
}
