package org.example;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("age must be at least 18");
        }

        System.out.println("age is valid");
    }
}
