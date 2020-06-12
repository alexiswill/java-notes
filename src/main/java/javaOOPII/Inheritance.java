package javaOOPII;


    class Animal {
        public Animal() {
            System.out.println("I am an Animal");
        }

        public void eat() {
            System.out.println("I can eat");
        }
    }

    class Dog extends Animal {
        public Dog(){
            super();
            System.out.println("I am a dog");
        }

        @Override
        public void eat() {
            super.eat();
            System.out.println("I eat dog food");
        }

        public void bark() {
            System.out.println("I can bark");
        }
    }

public class Inheritance {
        public static void main(String[] args) {
            Dog dog1 = new Dog();

            dog1.eat();
            dog1.bark();
        }
    }

