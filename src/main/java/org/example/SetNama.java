package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* SET:
*   - merupakan collection yang tidak mengenal index, sehingga value harus unique
*   - set memiliki 3 turunan : HashSet, LinkedHashSet, TreeSet
*   - HashSet merupakan set yang nggak boleh ada duplikasi dan ngga ada urutan
*   - LinkedHashSet merupakan set dengan urutan berdasarkan penambahan element
*   - TreeSet merupakan set yang bisa melakukan sorting value
* */
public class SetNama {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Tom");
        names.add("Marry");
        names.add("Peter");
        names.add("Alice");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
