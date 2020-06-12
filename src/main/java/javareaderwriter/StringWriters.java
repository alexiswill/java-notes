package javareaderwriter;

import java.io.StringWriter;

public class StringWriters {
        public static void main(String[] args) {

            String data = "This is the text in the string.";

            try {
                // Create a StringWriter with default string buffer capacity
                StringWriter output = new StringWriter();

                // Writes data to the string buffer
                output.write(data);

                // Prints the string writer
                System.out.println("Data in the StringWriter: " + output);

                output.close();
            }

            catch(Exception e) {
                e.getStackTrace();
            }
        }
    }


//public class Main {
//    public static void main(String[] args) {
//
//        String data = "This is the original data";
//
//        try {
//            // Create a StringWriter with default string buffer capacity
//            StringWriter output = new StringWriter();
//
//            // Writes data to the string buffer
//            output.write(data);
//
//            // Returns the string buffer
//            StringBuffer stringBuffer = output.getBuffer();
//            System.out.println("StringBuffer: " + stringBuffer);
//
//            // Returns the string buffer in string form
//            String string = output.toString();
//            System.out.println("String: " + string);
//
//            output.close();
//        }
//
//        catch(Exception e) {
//            e.getStackTrace();
//        }
//    }
//}
