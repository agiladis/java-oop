package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
class Employee {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class StreamFilter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 5000),
                new Employee("Bob", 35, 6000),
                new Employee("Charlie", 32, 7000),
                new Employee("David", 28, 4500),
                new Employee("Eve", 40, 8000)
        );

        // filter employee above 30 y.o
        List<Employee> employeesAbove30 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println("Employees above 30: " + employeesAbove30);

        // calculate the evg salary of employees aged over 30
        OptionalDouble averageSalaryAbove30 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .mapToDouble(Employee::getSalary)
                .average();
        averageSalaryAbove30.ifPresent(avg -> System.out.println("Average salary of employees above 30: " + avg));

        // listing name of employees aged over 30
        List<String> namesAbove30 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Names of employees above 30: " + namesAbove30);
    }
}
