package com.example.streamapi.map;

import java.util.HashMap;
import java.util.Map;

public class MapFirst {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        // print all the map values
        map.forEach((id, val) -> System.out.println(val));
        //---------------------computeIfPresent----------------------------------
        map.computeIfPresent(3, (num, val) -> val + num);
        map.get(3);
        System.out.println("Example of computeIfPresent" + map.get(3));

        map.computeIfPresent(9, (num, val) -> null);
        System.out.println("Example of computeIfPresent" + map.containsKey(9));

        //---------------------computeIfAbsent----------------------------------
        map.computeIfAbsent(11, num -> "val" + num);
        System.out.println("Example of computeIfAbsent" + map.get(11));
        map.computeIfAbsent(23, num -> "val" + num);
        System.out.println("Example of computeIfAbsent" + map.containsKey(23));    // true

        map.computeIfAbsent(3, num -> "bam");
        System.out.println("Example of computeIfAbsent" + map.get(3));
        //---------------------Removed----------------------------------
        map.remove(11);
        System.out.println("Example of removed" + map.get(11));

        map.remove(3, "val3");
        System.out.println("Example of removed" + map.get(3));

        map.remove(3, "val33");
        System.out.println("Example of removed" + map.get(3));

        //---------------------getOrDefault----------------------------------
        map.getOrDefault(42, "not found");
        System.out.println("Example of Default Value" + map.get(42));

        //---------------------merge----------------------------------
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println("Example of Merge =" + map.get(9));
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println("Example of Merge =" + map.get(9));             // val9

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        System.out.println("Example of Merge =" + map.get(9));
    }
}
