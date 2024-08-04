package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/* Stream Aggregate:
*   - operasi untuk melakukan perhitungan agregat dari suatu stream
*   - ada 2 method yaitu reduce dan max, ada min juga
*   - reduce() untuk menjumlahkan semua elemen dalam list
*   - max() mencari nilai max
* */
public class StreamAggregate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        Optional<Integer> maxOptional = numbers.stream()
                .max(Comparator.comparing(Integer::intValue));
        maxOptional.ifPresent(e -> System.out.println("Max: " + e));
    }
}
