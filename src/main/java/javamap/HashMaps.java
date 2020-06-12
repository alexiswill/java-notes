package javamap;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // Creating a hashmap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("HashMap1: " + evenNumbers);

        // Creating a hash map from other hashmap
        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("HashMap2: " + numbers);
    }
}

class HashMaps {
    public static void main(String[] args) {
        // Creating HashMap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("HashMap of even numbers: " + evenNumbers);

        //Creating HashMap of numbers
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("HashMap of numbers: " + numbers);
    }
}
