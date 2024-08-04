package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Stream API:
*   - adalah fitur pada Java 8 memungkinkan pemrosesan koleksi data secara deklaratif dan paralel
*   - digunakan untuk memanipulasi data besar tanpa merubah data asli dan tanpa disimpan terlebih dahulu
*   - opearsi stream dibagi menjadi intermediate operation dan terminal operation
*   - intermediate operation menghasilkan stream baru, memungkinkan proses chaining untuk operasi lanjut
*   - terminal operation adalah operasi yang men-trigger stream untuk mengalir dan berhenti*/

public class StreamExample {
    public static void main(String[] args) {
        // declared one string
        Stream<String> stream1 = Stream.of("abc");

        // empty string
        Stream<String> stream2 = Stream.empty();

        // null stream
        String data = null;
        Stream<String> stream3 = Stream.ofNullable(data);

        // array of string stream
        Stream<String> stream4 = Stream.of("abc", "def", "ghi");

        // collection stream
        Stream<Integer> stream5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream();

        // stream pipeline
        List<Integer> processedNumbers = stream5
                .filter(n -> n % 2 == 0)        // Intermediate operation: Filter angka genap
                .map(n -> n * 2)                // Intermediate operation: Kalikan setiap angka dengan 2
                .collect(Collectors.toList());  // Terminal operation: Kumpulkan hasilnya ke dalam daftar

        System.out.println(processedNumbers);
    }
}
