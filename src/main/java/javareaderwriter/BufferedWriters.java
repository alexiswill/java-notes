package javareaderwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriters {

        public static void main(String args[]) {

            String data = "This is the data in the output file";

            try {
                // Creates a FileWriter
                FileWriter file = new FileWriter("output.txt");

                // Creates a BufferedWriter
                BufferedWriter output = new BufferedWriter(file);

                // Writes the string to the file
                output.write(data);

                // Closes the writer
                output.close();
            }

            catch (Exception e) {
                e.getStackTrace();
            }
        }
    }


//public class Main {
//    public static void main(String[] args) {
//
//        String data = "This is a demo of the flush method";
//
//        try {
//            // Creates a FileWriter
//            FileWriter file = new FileWriter(" flush.txt");
//
//            // Creates a BufferedWriter
//            BufferedWriter output = new BufferedWriter(file);
//
//            // Writes data to the file
//            output.write(data);
//
//            // Flushes data to the destination
//            output.flush();
//            System.out.println("Data is flushed to the file.");
//
//            output.close();
//        }
//
//        catch(Exception e) {
//            e.getStackTrace();
//        }
//    }
//}
