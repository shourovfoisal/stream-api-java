package org.shourov.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String department;
    private double salary;
    
    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee(1L, "Ethan", "IT", 60000),
            new Employee(2L, "Emma", "HR", 50000),
            new Employee(3L, "Noah", "IT", 70000),
            new Employee(4L, "Olivia", "Finance", 80000),
            new Employee(5L, "Liam", "HR", 55000)
        );
    } 
    
    @Override
    public String toString() {
        return name;
    }
}
