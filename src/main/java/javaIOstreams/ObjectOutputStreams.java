package javaIOstreams;

import java.io.*;

public class ObjectOutputStreams {

    public static void main(String[] args) {

        int data1 = 5;
        String data2 = "This is programiz";

        try {

            FileOutputStream file = new FileOutputStream("file.txt");

            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // writes objects to output stream
            output.writeInt(data1);
            output.writeObject(data2);

            // Reads data using the ObjectInputStream
            FileInputStream fileStream = new FileInputStream("file.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            System.out.println("Integer data :" + objStream.readInt());
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}




//class Dog implements Serializable {
//
//    String name;
//    String breed;
//
//    public Dog(String name, String breed) {
//        this.name = name;
//        this.breed = breed;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        // Creates an object of Dog class
//        Dog dog1 = new Dog("Tyson", "Labrador");
//
//        try {
//            FileOutputStream fileOut = new FileOutputStream("file.txt");
//
//            // Creates an ObjectOutputStream
//            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
//
//            // Writes objects to the output stream
//            objOut.writeObject(dog1);
//
//            // Reads the object
//            FileInputStream fileIn = new FileInputStream("file.txt");
//            ObjectInputStream objIn = new ObjectInputStream(fileIn);
//
//            // Reads the objects
//            Dog newDog = (Dog) objIn.readObject();
//
//            System.out.println("Dog Name: " + newDog.name);
//            System.out.println("Dog Breed: " + newDog.breed);
//
//            objOut.close();
//            objIn.close();
//        }
//
//        catch (Exception e) {
//            e.getStackTrace();
//        }
//    }
//}