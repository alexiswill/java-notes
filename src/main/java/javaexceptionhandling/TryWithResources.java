package javaexceptionhandling;


import java.io.*;
import java.util.Scanner;

public class TryWithResources {

        public static void main(String[] args) {
            String line;
            try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
                while ((line = br.readLine()) != null) {
                    System.out.println("Line =>"+line);
                }
            } catch (IOException e) {
                System.out.println("IOException in try block =>" + e.getMessage());
            }
        }
    }

//Retrieving Suppressed Exceptions
//    catch(IOException e) {
//            System.out.println("Thrown exception=>" + e.getMessage());
//            Throwable[] suppressedExceptions = e.getSuppressed();
//            for (int i=0; i<suppressedExceptions.length; i++) {
//        System.out.println("Suppressed exception=>" + suppressedExceptions[i]);
//        }
//        }

class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line;

        try {
            System.out.println("Entering try block");
            br = new BufferedReader(new FileReader("test.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>"+line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        } finally {
            System.out.println("Entering finally block");
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("IOException in finally block =>"+e.getMessage());
            }

        }
    }
}

class Min {
    public static void main(String[] args) throws IOException{
        try (Scanner scanner = new Scanner(new File("testRead.txt"));
             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
    }
}

