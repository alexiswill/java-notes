package javaIOstreams;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreams {
        public static void main(String[] args) {

            String data = "This is a line of text inside the string.";

            try {
                // Creates an output stream
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] array = data.getBytes();

                // Writes data to the output stream
                out.write(array);

                // Retrieves data from the output stream in string format
                String streamData = out.toString();
                System.out.println("Output stream: " + streamData);

                out.close();
            }

            catch(Exception e) {
                e.getStackTrace();
            }
        }
    }


//class Main {
//    public static void main(String[] args) {
//        String data = "This is data.";
//
//        try {
//            // Creates an output stream
//            ByteArrayOutputStream out = new ByteArrayOutputStream();
//
//            // Writes data to the output stream
//            out.write(data.getBytes());
//
//            // Returns an array of bytes
//            byte[] byteData = out.toByteArray();
//            System.out.print("Data using toByteArray(): ");
//            for(int i=0; i<byteData.length; i++) {
//                System.out.print((char)byteData[i]);
//            }
//
//            // Returns a string
//            String stringData = out.toString();
//            System.out.println("\nData using toString(): " + stringData);
//
//            out.close();
//        }
//
//        catch(Exception e) {
//            e.getStackTrace();
//        }
//    }
//}
