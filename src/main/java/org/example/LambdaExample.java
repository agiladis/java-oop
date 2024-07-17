package org.example;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

/* LAMBDA
*   - adalah fitur yang menyederhanakan implementasi suatu method di interface
*   - lambda dapat digunakan hanya untuk interface yang memiliki satu method
*   - lambda dibagi jadi 3 bentuk: Consumer, Biconsumer, dan Supplier
*   - Consumer: adalah functional interface yg memiliki 1 argumen dan tidak mengembalikan nilai (void)
*   - Biconsumer: adalah functional interface yg memiliki 2 argumen dan tidak mengembalikan nilai (void)
*   - Supplier: adalah functional interface yg memiliki tidak memiliki argumen dan tidak mengembalikan nilai (void) biasanya mengembalikan objek
* */
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

        // an example of consumer
        System.out.println("---------- COMSUMER LAMBDA ----------");
        names.forEach(System.out::println); // ini bisa
        items.forEach(name -> System.out.println(name)); // ini juga bisa

        // an example of biconsumer
        System.out.println("---------- BICOMSUMER LAMBDA ----------");
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.forEach((name, age) -> System.out.println(name + " is " + age + " old"));

        // an example of supplier
        System.out.println("---------- SUPPLIER LAMBDA ----------");
        Supplier<LocalDate> dateSupplier = () -> LocalDate.now();
        LocalDate today = dateSupplier.get();
        System.out.println(today);
    }
}
