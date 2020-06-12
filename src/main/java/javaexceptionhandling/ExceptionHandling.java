package javaexceptionhandling;


//class Main {
//    public static void main(String[] args) {
//
//        try {
//            int divideByZero = 5 / 0;
//            System.out.println("Rest of code in try block");
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException => " + e.getMessage());
//        }
//
//    }
//}
//
//class ListOfNumbers {
//    public int[] arrayOfNumbers = new int[10];
//
//    public void writeList() {
//
//        try {
//            arrayOfNumbers[10] = 11;
//        } catch (NumberFormatException e1) {
//            System.out.println("NumberFormatException => " + e1.getMessage());
//        } catch (IndexOutOfBoundsException e2) {
//            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
//        }
//
//    }
//}
//
//class EH {
//    public static void main(String[] args) {
//        ListOfNumbers list = new ListOfNumbers();
//        list.writeList();
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        try {
//            int divideByZero = 5 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException => " + e.getMessage());
//        } finally {
//            System.out.println("Finally block is always executed");
//        }
//    }
//}


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ListOfNumbers {
    private int[] list = new int[10];

    public ListOfNumbers() {
        // storing integer values in the list array
        for (int i = 0; i < 10; i++) {
            list[i] = i;
        }
    }




    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");

            // creating a new file OutputFile.txt
            out = new PrintWriter(new FileWriter("OutputFile.txt"));

            // writing values from list array to the new created file
            for (int i = 0; i < 10; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("IndexOutOfBoundsException => " + e1.getMessage());
        } catch (IOException e2) {
            System.out.println("IOException => " + e2.getMessage());
        } finally {
            // checking if PrintWriter has been opened
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }

    }
}


