package org.example;

// Call fro ENUM
public class Main {
    public static void main(String[] args) {
        Seasons musim = Seasons.WINTER;

        if (musim == Seasons.WINTER) {
            System.out.println("Yaa musim dingin");
        }

        for (Seasons s : Seasons.values()) // get all values of enum
        {
            System.out.println(s + " " + s.value);
        }
    }
}