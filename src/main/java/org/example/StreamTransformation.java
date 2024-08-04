package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTransformation {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "e", "f");
        List<List<String>> listOfLists = Arrays.asList(list1, list2);

        List<String> listOfString = listOfLists.stream()
                .flatMap(p -> p.stream())
                .collect(Collectors.toList());

        System.out.println(listOfString);
    }
}
