package org.example;

/* SUBCLASS ABSTRACT CLASS:
    - subclass Employee wajib everriding abstract method dari abstract class
    -
* */
public class Employee extends Person {
    private String EmployeeId;
    public Employee() {
        super();
    }

    @Override
    public void work() {
        System.out.println("Working");
    }
}
