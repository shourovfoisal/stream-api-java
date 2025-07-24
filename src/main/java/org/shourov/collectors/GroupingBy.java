package org.shourov.collectors;

import org.shourov.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
    
    public static void groupingByOddOrEven() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Map<String, List<Integer>> group = numbers.stream().collect(Collectors.groupingBy(elem -> elem % 2 == 0 ? "Even" : "Odd"));

        Utils.printMap(group);
    }
}
