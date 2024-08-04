package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
class Student {
    int id;
    String name;
    int age;

    @Override
    public String toString() {
        return "Student {id: " + id + ", name: " + name + ", age: " + age + "}";
    }
}

public class CollectorsConcept {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(11, "Bobon", 22));
        studentList.add(new Student(22, "Santoso", 18));
        studentList.add(new Student(33, "Ridwan", 32));
        studentList.add(new Student(44, "Asep", 22));

        // penggunaan collectors untuk menghasilkan data set
        Set<Student> students = studentList.stream()
                .filter(n -> n.age > 18)
                .collect(Collectors.toSet());
        students.forEach(System.out::println);

        // penggunaan collectors untuk menghitung  rata-rata umur
        Double avgAge = studentList.stream()
                .collect(Collectors.averagingInt(s -> s.age));
        System.out.println("Average age of students is: " + avgAge);

        OptionalDouble avgAge2 = studentList.stream()
                .mapToDouble(Student::getAge)
                .average();
        System.out.println("Average age of students is: " + avgAge2.orElse(0.0));
    }
}
