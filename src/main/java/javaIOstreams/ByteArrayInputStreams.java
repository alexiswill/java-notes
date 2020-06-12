package javaIOstreams;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreams {
        public static void main(String[] args) {

            // Creates an array of byte
            byte[] array = {1, 2, 3, 4};

            try {
                ByteArrayInputStream input = new ByteArrayInputStream(array);

                System.out.print("The bytes read from the input stream: ");

                for(int i= 0; i < array.length; i++) {

                    // Reads the bytes
                    int data = input.read();
                    System.out.print(data + ", ");
                }
                input.close();
            }

            catch(Exception e) {
                e.getStackTrace();
            }
        }
    }

//public class Main {
//
//    public static void main(String args[]) {
//
//        // Creates an array of bytes
//        byte[] array = { 1, 2, 3, 4 };
//
//        try {
//            ByteArrayInputStream input = new ByteArrayInputStream(array);
//
//            // Returns the available number of bytes
//            System.out.println("Available bytes at the beginning: " + input.available());
//
//            // Reads 2 bytes from the input stream
//            input.read();
//            input.read();
//
//            // Returns the available number of bytes
//            System.out.println("Available bytes at the end: " + input.available());
//
//            input.close();
//        }
//
//        catch (Exception e) {
//            e.getStackTrace();
//        }
//    }
//}

//public class Main {
//
//    public static void main(String args[]) {
//
//        // Create an array of bytes
//        byte[] array = { 1, 2, 3, 4 };
//        try {
//            ByteArrayInputStream input = new ByteArrayInputStream(array);
//
//            // Using the skip() method
//            input.skip(2);
//            System.out.print("Input stream after skipping 2 bytes: ");
//
//            int data = input.read();
//            while (data != -1) {
//                System.out.print(data + ", ");
//                data = input.read();
//            }
//
//            // close() method
//            input.close();
//        }
//
//        catch (Exception e) {
//            e.getStackTrace();
//        }
//    }
//}