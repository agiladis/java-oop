package org.example;

/* ABSTRACT:
    - gunakan ketika ada relasi "is-a" yang kuat antara kelas.
    - menggunakan keyword abstract
    - boleh ada abstract method : deklarasi method tanpa inmplementasi code
    - boleh ada method non-abstract (konkrit) : TAPI abstract class gabisa di instance
    - abstract class cuman bisa diinstace kalau melalui subclass dari abstract class
    - boleh ada field dan constructor
* */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Person {
    private String name; // variable instance
    private String gender;

    public abstract void work(); // abstract method
    // non-abstract or concrete method
    protected void changeName(String newName)
    {
        this.name = newName;
    }
}
