package org.shourov;

import java.util.List;
import java.util.Map;

public class Utils {
    
    public static <K, V> void printMap(Map<K, V> map) {
        printMap(map, 0);
    }
    
    public static <K, V> void printMap(Map<K, V> map, int indentLevel) {
        String indent = "\t".repeat(indentLevel);
        
        for(Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            System.out.print(indent + "[" + key + "] ");
            
            if(value instanceof List) {
                ((List<?>) value).forEach(item -> System.out.print(item + " "));
                System.out.println();
            } else if(value instanceof Map<?, ?>) {
                System.out.println();
                printMap((Map<?, ?>) value, indentLevel + 1);
            } else {
                System.out.println(value);
            }
        }
    }
}
