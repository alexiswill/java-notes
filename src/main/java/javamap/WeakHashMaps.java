package javamap;

import java.util.WeakHashMap;

public class WeakHashMaps {
        public static void main(String[] args) {
            // Creating WeakHashMap of even numbers
            WeakHashMap<String, Integer> evenNumbers = new WeakHashMap<>();

            String two = new String("Two");
            Integer twoValue = 2;

            // Using put()
            evenNumbers.put(two, twoValue);

            String four = new String("Four");
            Integer fourValue = 4;

            // Using putIfAbsent()
            evenNumbers.putIfAbsent(four, fourValue);
            System.out.println("WeakHashMap of even numbers: " + evenNumbers);

            //Creating WeakHashMap of numbers
            WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

            String one = new String("One");
            Integer oneValue = 1;
            numbers.put(one, oneValue);

            // Using putAll()
            numbers.putAll(evenNumbers);
            System.out.println("WeakHashMap of numbers: " + numbers);
        }
    }

//class Main {
//    public static void main(String[] args) {
//        // Creating WeakHashMap of even numbers
//        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();
//
//        String one = new String("One");
//        Integer oneValue = 1;
//        numbers.put(one, oneValue);
//
//        String two = new String("Two");
//        Integer twoValue = 2;
//        numbers.put(two, twoValue);
//
//        System.out.println("WeakHashMap: " + numbers);
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
