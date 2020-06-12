package javamap;

import java.util.EnumMap;

public class EnumMaps {

        enum Size {
            SMALL, MEDIUM, LARGE, EXTRALARGE
        }
        public static void main(String[] args) {

            // Creating an EnumMap of the Size enum
            EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);

            // Using the put() Method
            sizes1.put(Size.SMALL, 28);
            sizes1.put(Size.MEDIUM, 32);
            System.out.println("EnumMap1: " + sizes1);

            EnumMap<Size, Integer> sizes2 = new EnumMap<>(Size.class);

            // Using the putAll() Method
            sizes2.putAll(sizes1);
            sizes2.put(Size.LARGE, 36);
            System.out.println("EnumMap2: " + sizes2);
        }
    }

//class Main {
//
//    enum Size {
//        SMALL, MEDIUM, LARGE, EXTRALARGE
//    }
//    public static void main(String[] args) {
//
//        // Creating an EnumMap of the Size enum
//        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
//        sizes.put(Size.SMALL, 28);
//        sizes.put(Size.MEDIUM, 32);
//        sizes.put(Size.LARGE, 36);
//        sizes.put(Size.EXTRALARGE, 40);
//        System.out.println("EnumMap: " + sizes);
//
//        // Using the entrySet() Method
//        System.out.println("Key/Value mappings: " + sizes.entrySet());
//
//        // Using the keySet() Method
//        System.out.println("Keys: " + sizes.keySet());
//
//        // Using the values() Method
//        System.out.println("Values: " + sizes.values());
//    }
//}

//class Main {
//
//    enum Size {
//        SMALL, MEDIUM, LARGE, EXTRALARGE
//    }
//    public static void main(String[] args) {
//
//        // Creating an EnumMap of the Size enum
//        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
//        sizes.put(Size.SMALL, 28);
//        sizes.put(Size.MEDIUM, 32);
//        sizes.put(Size.LARGE, 36);
//        sizes.put(Size.EXTRALARGE, 40);
//        System.out.println("EnumMap: " + sizes);
//
//        // Using the remove() Method
//        int value = sizes.remove(Size.MEDIUM);
//        System.out.println("Removed Value: " + value);
//
//        boolean result = sizes.remove(Size.SMALL, 28);
//        System.out.println("Is the entry {SMALL=28} removed? " + result);
//
//        System.out.println("Updated EnumMap: " + sizes);
//    }
//}