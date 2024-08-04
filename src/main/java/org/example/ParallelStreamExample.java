package org.example;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Menggunakan parallel stream untuk menjumlahkan semua angka
        int sum = numbers.parallelStream()
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
