package org.example;


// Call for ENUM
public class Main {
    public static void main(String[] args) {
        Human student = new Human("aha", 19);
        System.out.println(student.getNama());

        student.setNama("Aca");
        System.out.println(student.getNama());

        // ENUM
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