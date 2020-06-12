package javaIOstreams;

import java.io.PrintStream;

public class PrintStreams {
        public static void main(String[] args) {

            String data = "Hello World.";
            System.out.print(data);
        }
    }



class Mai {
    public static void main(String[] args) {

        String data = "This is a text inside the file.";

        try {
            PrintStream output = new PrintStream("output.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}

//class Main {
//    public static void main(String[] args) {
//
//        try {
//            PrintStream output = new PrintStream("output.txt");
//
//            int age = 25;
//
//            output.printf("I am %d years old.", age);
//            output.close();
//        }
//        catch(Exception e) {
//            e.getStackTrace();
//        }
//    }
//}
