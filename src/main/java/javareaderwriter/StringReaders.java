package javareaderwriter;

import java.io.StringReader;

public class StringReaders {
        public static void main(String[] args) {

            String data = "This is the text read from StringReader.";

            // Create a character array
            char[] array = new char[100];

            try {
                // Create a StringReader
                StringReader input = new StringReader(data);

                //Use the read method
                input.read(array);
                System.out.println("Data read from the string:");
                System.out.println(array);

                input.close();
            }
            catch(Exception e) {
                e.getStackTrace();
            }
        }
    }


//public class Main {
//    public static void main(String[] args) {
//
//        String data = "This is the text read from StringReader";
//        System.out.println("Original data: " + data);
//
//        // Create a character array
//        char[] array = new char[100];
//
//        try {
//            // Create a StringReader
//            StringReader input = new StringReader(data);
//
//            // Use the skip() method
//            input.skip(5);
//
//            //Use the read method
//            input.read(array);
//            System.out.println("Data after skipping 5 characters:");
//            System.out.println(array);
//
//            input.close();
//        }
//
//        catch(Exception e) {
//            e.getStackTrace();
//        }
//    }
//}
