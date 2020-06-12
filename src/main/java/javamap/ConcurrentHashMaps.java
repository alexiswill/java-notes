package javamap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;

public class ConcurrentHashMaps {
        public static void main(String[] args) {

            // Creating a hashmap of even numbers
            HashMap<String, Integer> evenNumbers = new HashMap<>();
            evenNumbers.put("Two", 2);
            evenNumbers.put("Four", 4);
            System.out.println("HashMap: " + evenNumbers);

            // Creating a concurrent hashmap from other map
            ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>(evenNumbers);
            numbers.put("Three", 3);
            System.out.println("ConcurrentHashMap: " + numbers);
        }
    }

//class Main {
//    public static void main(String[] args) {
//        // Creating ConcurrentHashMap of even numbers
//        ConcurrentHashMap<String, Integer> evenNumbers = new ConcurrentHashMap<>();
//
//        // Using put()
//        evenNumbers.put("Two", 2);
//        evenNumbers.put("Four", 4);
//
//        // Using putIfAbsent()
//        evenNumbers.putIfAbsent("Six", 6);
//        System.out.println("ConcurrentHashMap of even numbers: " + evenNumbers);
//
//        //Creating ConcurrentHashMap of numbers
//        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
//        numbers.put("One", 1);
//
//        // Using putAll()
//        numbers.putAll(evenNumbers);
//        System.out.println("ConcurrentHashMap of numbers: " + numbers);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//
//        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
//        numbers.put("One", 1);
//        numbers.put("Two", 2);
//        numbers.put("Three", 3);
//        System.out.println("ConcurrentHashMap: " + numbers);
//
//        // Using search()
//        String key = numbers.search(4, (k, v) -> {return v == 3 ? k: null;});
//        System.out.println("Searched value: " + key);
//
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
//        numbers.put("One", 1);
//        numbers.put("Two", 2);
//        numbers.put("Three", 3);
//        System.out.println("ConcurrentHashMap: " + numbers);
//
//        // Using search()
//        int sum = numbers.reduce(4, (k, v) -> v, (v1, v2) -> v1 + v2);
//        System.out.println("Sum of all values: " + sum);
//
//    }
//}


