package javaIOstreams;

import java.io.FileOutputStream;

public class FileOutputStreams {
        public static void main(String[] args) {

            String data = "This is a line of text inside the file.";

            try {
                FileOutputStream output = new FileOutputStream("output.txt");

                byte[] array = data.getBytes();

                // Writes byte to the file
                output.write(array);

                output.close();
            }

            catch(Exception e) {
                e.getStackTrace();
            }
        }
    }

//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        FileOutputStream out = null;
//        String data = "This is demo of flush method";
//
//        try {
//            out = new FileOutputStream(" flush.txt");
//
//            // Using write() method
//            out.write(data.getBytes());
//
//            // Using the flush() method
//            out.flush();
//            out.close();
//        }
//        catch(Exception e) {
//            e.getStackTrace();
//        }
//    }
//}
