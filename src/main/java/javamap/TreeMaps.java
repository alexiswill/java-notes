package javamap;

import java.util.TreeMap;

public class TreeMaps {
        public static void main(String[] args) {
            // Creating TreeMap of even numbers
            TreeMap<String, Integer> evenNumbers = new TreeMap<>();

            // Using put()
            evenNumbers.put("Two", 2);
            evenNumbers.put("Four", 4);

            // Using putIfAbsent()
            evenNumbers.putIfAbsent("Six", 6);
            System.out.println("TreeMap of even numbers: " + evenNumbers);

            //Creating TreeMap of numbers
            TreeMap<String, Integer> numbers = new TreeMap<>();
            numbers.put("One", 1);

            // Using putAll()
            numbers.putAll(evenNumbers);
            System.out.println("TreeMap of numbers: " + numbers);
        }
    }


//class Main {
//    public static void main(String[] args) {
//        TreeMap<String, Integer> numbers = new TreeMap<>();
//
//        numbers.put("One", 1);
//        numbers.put("Two", 2);
//        numbers.put("Three", 3);
//        System.out.println("TreeMap: " + numbers);
//
//        // Using entrySet()
//        System.out.println("Key/Value mappings: " + numbers.entrySet());
//
//        // Using keySet()
//        System.out.println("Keys: " + numbers.keySet());
//
//        // Using values()
//        System.out.println("Values: " + numbers.values());
//    }
//}


//class Main {
//    public static void main(String[] args) {
//        TreeMap<String, Integer> numbers = new TreeMap<>();
//        numbers.put("First", 1);
//        numbers.put("Second", 2);
//        numbers.put("Third", 3);
//        System.out.println("TreeMap: " + numbers);
//
//        // Using the firstKey() method
//        String firstKey = numbers.firstKey();
//        System.out.println("First Key: " + firstKey);
//
//        // Using the lastKey() method
//        String lastKey = numbers.lastKey();
//        System.out.println("Last Key: " + lastKey);
//
//        // Using firstEntry() method
//        System.out.println("First Entry: " + numbers.firstEntry());
//
//
//        // Using the lastEntry() method
//        System.out.println("Last Entry: " + numbers.lastEntry());
//    }
//}