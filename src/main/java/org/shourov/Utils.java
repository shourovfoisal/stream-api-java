package org.shourov;

import java.util.List;
import java.util.Map;

public class Utils {
    public static <K, V> void printMap(Map<K, V> map) {
        for(Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            System.out.print(key + ": ");
            
            if(value instanceof List) {
                ((List<?>) value).forEach(item -> System.out.print(item + " "));
                System.out.println();
            } else {
                System.out.println(value);
            }
        }
    }
}
