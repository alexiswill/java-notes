package javaexceptionhandling;


//Multiple catch blocks
class MultipleExceptions {

        public static void main(String[] args) {
            try {
                int array[] = new int[10];
                array[10] = 30 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }


//Multi-catch block

//class Main {
//    public static void main(String[] args) {
//        try {
//            int array[] = new int[10];
//            array[10] = 30 / 0;
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}


// Catching base exception class only

//class Main {
//    public static void main(String[] args) {
//        try {
//            int array[] = new int[10];
//            array[10] = 30 / 0;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}

//Catching base and child exception classes (meant to be red)
// If the base exception class has already been specified in the catch block, do not use child exception classes in the same catch block.
//class Main {
//    public static void main(String[] args) {
//        try {
//            int array[] = new int[10];
//            array[10] = 30 / 0;
//        } catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}