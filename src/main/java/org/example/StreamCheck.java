package org.example;

import java.util.Arrays;
import java.util.List;

/*Stream Check:
*   - untuk melakukan pencocokan stream yang punya return boolean
*   - beberapa operasinya yaitu anyMatch() dan allMatch
* */

public class StreamCheck {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("book", "what");

        boolean anyMatch = words.stream()
                .anyMatch(word -> word.length() > 4);

        if (anyMatch) {
            System.out.println("there is any word containing a length of more than 4");
        } else {
            System.out.println("there is no word containing a length of more than 4");
        }
    }
}
