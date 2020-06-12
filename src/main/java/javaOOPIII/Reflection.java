package javaOOPIII;

interface Animals {
    public void display();
}

interface Mammal {
    public void makeSound();
}

class Dog implements Animals, Mammal {
    public void display() {
        System.out.println("I am a dog.");
    }

    public void makeSound() {
        System.out.println("Bark bark");
    }
}

class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // create an object of Dog class
            Dog d1 = new Dog();

            // create an object of Class using getClass()
            Class obj = d1.getClass();

            // find the interfaces implemented by Dog
            Class[] objInterface = obj.getInterfaces();
            for(Class c : objInterface) {

                // print the name of interfaces
                System.out.println("Interface Name: " + c.getName());
            }
        }

        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
//class Dog {
//    public void display() {
//        System.out.println("I am a dog.");
//    }
//
//    protected void eat() {
//        System.out.println("I eat dog food.");
//    }
//
//    private void makeSound() {
//        System.out.println("Bark Bark");
//    }
//
//}

//class ReflectionDemo {
//    public static void main(String[] args) {
//        try {
//            Dog d1 = new Dog();
//
//            // create an object of Class
//            Class obj = d1.getClass();
//
//            // get all the methods using the getDeclaredMethod()
//            Method[] methods = obj.getDeclaredMethods();
//
//            // get the name of methods
//            for(Method m : methods) {
//
//                System.out.println("Method Name: " + m.getName());
//
//                // get the access modifier of methods
//                int modifier = m.getModifiers();
//                System.out.println("Modifier: " + Modifier.toString(modifier));
//
//                // get the return types of method
//                System.out.println("Return Types: " + m.getReturnType());
//                System.out.println(" ");
//            }
//        }
