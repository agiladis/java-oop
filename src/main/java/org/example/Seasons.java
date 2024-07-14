package org.example;

/* ENUM
    - tipe data khussu pada java untuk menyimpan sekumoulan nilai konstan
    - boleh memiliki field adan metode
* */
public enum Seasons {
    WINTER(5), SPRING(10), SUMMER(15), FALL(20);

    final int value; // merupakan constant berupa angka
    private Seasons(int value) {
        this.value = value;
    }
}
