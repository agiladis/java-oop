package org.example;

import java.util.Arrays;
import java.util.List;

public class StreamForEach {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("book", "what", "when", "where");
        words.stream().forEach(System.out::println);
    }
}
