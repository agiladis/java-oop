package org.example;

public class Main {
    public static void main(String[] args) {
        StudentRecords student = new StudentRecords("Ridwan");

        System.out.println(student.name());
        System.out.println(student.npm());
    }
}