package org.example;

/* INTERFACE:
    - hanya berisi abstract method
    - ga punya field
    - ga punya constructor
    - ga bisa di-instance
* */
public interface Registration {
    void registration(String name);
    Person getRegisteredPerson(String name);
}
