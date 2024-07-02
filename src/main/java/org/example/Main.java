package org.example;

public class Main {
    public static void main(String[] args) {
        StudentRecords studentRecord = new StudentRecords("Ridwan");

        System.out.println(studentRecord.name());
        System.out.println(studentRecord.npm());
    }
}