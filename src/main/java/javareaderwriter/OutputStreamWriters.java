package javareaderwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriters {
        public static void main(String args[]) {

            String data = "This is a line of text inside the file.";

            try {
                // Creates a FileOutputStream
                FileOutputStream file = new FileOutputStream("output.txt");

                // Creates an OutputStreamWriter
                OutputStreamWriter output = new OutputStreamWriter(file);

                // Writes string to the file
                output.write(data);

                // Closes the writer
                output.close();
            }

            catch (Exception e) {
                e.getStackTrace();
            }
        }
    }


//class Main {
//    public static void main(String[] args) {
//
//        try {
//            // Creates an output stream
//            FileOutputStream file = new FileOutputStream("output.txt");
//
//            // Creates an output stream reader with default encoding
//            OutputStreamWriter output1 = new OutputStreamWriter(file);
//
//            // Creates an output stream reader specifying the encoding
//            OutputStreamWriter output2 = new OutputStreamWriter(file, Charset.forName("UTF8"));
//
//            // Returns the character encoding of the output stream
//            System.out.println("Character encoding of output1: " + output1.getEncoding());
//            System.out.println("Character encoding of output2: " + output2.getEncoding());
//
//            // Closes the reader
//            output1.close();
//            output2.close();
//        }
//
//        catch(Exception e) {
//            e.getStackTrace();
//        }
//    }
//}
