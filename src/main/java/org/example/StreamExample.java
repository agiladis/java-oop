package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("John", "Jane", "Jack", "Doe", "Smith");

        // using stream to filter and mapping data
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(filteredNames);

        List <String> words = Arrays.asList("abc", "defg");
        words.stream().forEach(System.out::print);
    }
}
