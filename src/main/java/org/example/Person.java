package org.example;

public abstract class Person {
    private String name;
    private String gender;

    public Person() {}

    // example of abstract class
    public abstract void work();

    protected void changeName(String newName)
    {
        this.name = newName;
    }
}
