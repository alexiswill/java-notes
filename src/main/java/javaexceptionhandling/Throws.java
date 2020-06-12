package javaexceptionhandling;

import java.io.*;
class Throws {
    public static void findFile() throws IOException {
        // code that may produce IOException
        File newFile=new File("test.txt");
        FileInputStream stream=new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try{
            findFile();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}

//class Main {
//    public static void divideByZero() {
//        throw new ArithmeticException("Trying to divide by 0");
//    }
//
//    public static void main(String[] args) {
//        divideByZero();
//    }
//}

//class Main {
//    public static void findFile() throws IOException {
//        throw new IOException("File not found");
//    }
//
//    public static void main(String[] args) {
//        try {
//            findFile();
//            System.out.println("Rest of code in try block");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
