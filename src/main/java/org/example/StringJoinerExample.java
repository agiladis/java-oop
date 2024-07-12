package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/* StringJoiner:
*   - memungkinkan untuk menggabungkan string pakai delimiter
* */
public class StringJoinerExample {
    public static void main(String[] args) {
        List<String> rgbList = new ArrayList<>();

        rgbList.add("Red");
        rgbList.add("Green");
        rgbList.add("Blue");

        StringJoiner rgbJoiner = new StringJoiner(",", "-", ";");

        for (String color : rgbList) {
            rgbJoiner.add(color);
        }

        System.out.println(rgbJoiner.toString());
    }

}
