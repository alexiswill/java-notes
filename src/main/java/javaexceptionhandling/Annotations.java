package javaexceptionhandling;

class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

class Mn {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
//
//class M {
//    @SuppressWarnings("unchecked")
//    static void wordsList() {
//        ArrayList wordList = new ArrayList<>();
//
//// This causes an unchecked warning
//        wordList.add("programiz");
//
//        System.out.println("Word list => " + wordList);
//    }
//
//    public static void main(String args[]) {
//        wordsList();
//    }
//}