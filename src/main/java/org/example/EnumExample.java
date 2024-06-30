package org.example;

/* ENUM:
    - enum merupakan tipe data khusus pada java
    - berisi konstanta
    - bisa memiliki metode dan atribut/field
* */
public class EnumExample {
    enum Season {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);

        private int value; // merupakan constant berupa angka
        private Season(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s + " " + s.value);
    }
}
