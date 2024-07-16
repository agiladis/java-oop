package org.example;

import java.util.ArrayList;
import java.util.List;

/* LIST:
*   - merupakan turunan dari interface iiterable (sifatnya sequence)
*   - list ada 3 turunan : ArrayList, Vector, LinkedList
*   - ArrayList sama seperti Array namun sizenya bisa berubah
* */
public class ListBarang {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("kursi");
        list.add("meja");
        list.add("lemari");
        list.add("ember");
        list.add("gayung");

        System.out.println("Isi dari list: ");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
