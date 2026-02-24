package org.example.training;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapForeachExample {
    public static void main(String[] args) {
        // Create a TreeMap with String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some entries to the TreeMap
        treeMap.put("Grape", 4);
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);

        // Iterate over the TreeMap using an enhanced for loop
        System.out.println("Iterating over TreeMap entries:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            //System.out.println("Key: " + key + ", Value: " + value);
        }

        // Alternatively, using the forEach method (Java 8 and later)
        //System.out.println("\nIterating over TreeMap using forEach method:");
        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        TreeMap<Fruit, Integer> fruitRanks = new TreeMap<>();
        fruitRanks.put(new Fruit("Orange", 4), 2);
        fruitRanks.put(new Fruit("Banana", 2), 5);
        fruitRanks.put(new Fruit("Apple", 1), 10);
        fruitRanks.put(new Fruit("Plum", 5), 2);
        fruitRanks.put(new Fruit("Grape", 3), 7);

        fruitRanks.forEach( (k, v) -> System.out.println(k));
        System.out.println();
        for (Map.Entry<Fruit, Integer> entry: fruitRanks.entrySet()) {
            System.out.println(entry.getKey());
        }
    }


}