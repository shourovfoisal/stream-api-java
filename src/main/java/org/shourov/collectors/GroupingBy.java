package org.shourov.collectors;

import org.shourov.Utils;
import org.shourov.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Java’s Collectors.groupingBy() Method Explained
 * https://medium.com/@AlexanderObregon/javas-collectors-groupingby-method-explained-a5be61c80e0e
 */
public class GroupingBy {

    public static void groupingByStringLength() {
        List<String> names = Arrays.asList("Alex", "Bob", "Caleb", "Derek", "Evan", "Fred");
        Map<Integer, List<String>> group = names.stream().collect(Collectors.groupingBy(String::length));
        Utils.printMap(group);
    }

    public static void nestedGrouping() {
        List<String> names = Arrays.asList("Alex", "Bob", "Caleb", "Derek", "Evan", "Fred", "David", "Alan", "Jack", "John");
        Map<Integer, Map<Character, List<String>>> group = names.stream().collect(Collectors.groupingBy(String::length, Collectors.groupingBy(name -> name.charAt(0))));
        Utils.printMap(group);
    }

    public static void groupingByOddOrEven() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Map<String, List<Integer>> group = numbers.stream().collect(Collectors.groupingBy(elem -> elem % 2 == 0 ? "Even" : "Odd"));
        Utils.printMap(group);
    }

    public static void groupingWithTreeMap() {
        List<String> names = Arrays.asList("Alex", "Bob", "Caleb", "Derek", "Evan", "Fred");
        Map<Integer, List<String>> group = names.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        Utils.printMap(group);
    }
    
    public static void groupingByObjectFields() {
        List<Employee> employees = Employee.getEmployees();
        Map<String, List<Employee>> group = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Utils.printMap(group);
    }

    public static void countingByObjectFields() {
        List<Employee> employees = Employee.getEmployees();
        Map<String, Long> group = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Utils.printMap(group);
    }

    public static void summingByObjectFields() {
        List<Employee> employees = Employee.getEmployees();
        Map<String, Double> group = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        Utils.printMap(group);
    }
}
