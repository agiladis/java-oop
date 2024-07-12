package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* MAP:
*   - map memiliki struktur key dan value
*   - map tidak memiliki index, untuk intu menggunakan key yang unique
*   - map memiliki 3 turunan : HashMap, LinkedHashMap, TreeMap
*   - HashMap adalah map yang ngga ada urutan dan boleh null
*   - LinkedHashMap adalah turunan HashMap yang memiliki urutan berdasarkan kapan elemen ditambahkan
*   - TreeMap adalah map yang ngga boleh ada null karena harus bisa di sorting key ataupun value
* */
public class MapCountryCodes {
    public static void main(String[] args) {
        Map<String, String> mapCountryCode = new HashMap<>();

        mapCountryCode.put("1", "USA");
        mapCountryCode.put("44", "United Kingdom");
        mapCountryCode.put("33", "France");
        mapCountryCode.put("81", "Japan");

        Set<String> setCodes = mapCountryCode.keySet();
        Iterator<String> iterator = setCodes.iterator();

        while (iterator.hasNext()) { // dengan iterator
            String code = iterator.next();
            String country = mapCountryCode.get(code);
            System.out.println(code + " => " + country);
        }

        System.out.println("===============================");

        for (String code : mapCountryCode.keySet()) { // tanpa iterator
            System.out.println(mapCountryCode.get(code));
        }

        System.out.println("===============================");

        for (Map.Entry<String, String> entry : mapCountryCode.entrySet()) { // best practice with entrySet()
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " => " + value);
        }
    }
}
