package javaexceptionhandling;

public class AnnotationTypes {
        /**
         * @deprecated
         * This method is deprecated and has been replaced by newMethod()
         */
        @Deprecated
        public static void deprecatedMethod() {
            System.out.println("Deprecated method");
        }

        public static void main(String args[]) {
            deprecatedMethod();
        }
    }

//class Animals {
//
//    // overridden method
//    public void display(){
//        System.out.println("I am an animal");
//    }
//}
//
//class Dog extends Animal {
//
//    // overriding method
//    @Override
//    public void display(){
//        System.out.println("I am a dog");
//    }
//
//    public void printMessage(){
//        display();
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Dog dog1 = new Dog();
//        dog1.printMessage();
//    }
//}

//class Main {
//    @Deprecated
//    public static void deprecatedMethod() {
//        System.out.println("Deprecated method");
//    }
//
//    @SuppressWarnings("deprecated")
//    public static void main(String args[]) {
//        Main depObj = new Main();
//        depObj. deprecatedMethod();
//    }
//}