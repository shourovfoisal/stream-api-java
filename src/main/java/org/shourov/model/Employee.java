package org.shourov.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public class Employee {
    private String name;
    private String department;
    private double salary;
    
    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee("Ethan", "IT", 60000),
            new Employee("Emma", "HR", 50000),
            new Employee("Noah", "IT", 70000),
            new Employee("Olivia", "Finance", 80000),
            new Employee("Liam", "HR", 55000)
        );
    } 
    
    @Override
    public String toString() {
        return name;
    }
}
