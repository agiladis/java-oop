package org.example;

/* ABSTRACT:
    - menggunakan keyword abstract
    - boleh ada abstract method : deklarasi method tanpa inmplementasi code
    - boleh ada method non-abstract : TAPI abstract class gabisa di instance
    - abstract class cuman bisa diinstace kalau abstract class sudah punya subclass
* */
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
