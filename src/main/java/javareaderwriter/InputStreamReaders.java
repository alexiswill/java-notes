package javareaderwriter;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaders {
        public static void main(String[] args) {

            // Creates an array of character
            char[] array = new char[100];

            try {
                // Creates a FileInputStream
                FileInputStream file = new FileInputStream("input.txt");

                // Creates an InputStreamReader
                InputStreamReader input = new InputStreamReader(file);

                // Reads characters from the file
                input.read(array);
                System.out.println("Data in the stream:");
                System.out.println(array);

                // Closes the reader
                input.close();
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
//            // Creates a FileInputStream
//            FileInputStream file = new FileInputStream("input.txt");
//
//            // Creates an InputStreamReader with default encoding
//            InputStreamReader input1 = new InputStreamReader(file);
//
//            // Creates an InputStreamReader specifying the encoding
//            InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF8"));
//
//            // Returns the character encoding of the input stream
//            System.out.println("Character encoding of input1: " + input1.getEncoding());
//            System.out.println("Character encoding of input2: " + input2.getEncoding());
//
//            // Closes the reader
//            input1.close();
//            input2.close();
//        }
//
//        catch(Exception e) {
//            e.getStackTrace();
//        }
//    }
//}
