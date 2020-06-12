package javamap;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

        public static void main(String[] args) {
            // Creating a map using the HashMap
            Map<String, Integer> numbers = new HashMap<>();

            // Insert elements to the map
            numbers.put("One", 1);
            numbers.put("Two", 2);
            System.out.println("Map: " + numbers);

            // Access keys of the map
            System.out.println("Keys: " + numbers.keySet());

            // Access values of the map
            System.out.println("Values: " + numbers.values());

            // Access entries of the map
            System.out.println("Entries: " + numbers.entrySet());

            // Remove Elements from the map
            int value = numbers.remove("Two");
            System.out.println("Removed Value: " + value);
        }
    }
//class Main {
//
//    public static void main(String[] args) {
//        // Creating Map using TreeMap
//        Map<String, Integer> values = new TreeMap<>();
//
//        // Insert elements to map
//        values.put("Second", 2);
//        values.put("First", 1);
//        System.out.println("Map using TreeMap: " + values);
//
//        // Replacing the values
//        values.replace("First", 11);
//        values.replace("Second", 22);
//        System.out.println("New Map: " + values);
//
//        // Remove elements from the map
//        int removedValue = values.remove("First");
//        System.out.println("Removed Value: " + removedValue);
//    }
//}
