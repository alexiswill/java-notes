package javaOOPII;

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(24);
        System.out.println("My age is " + p1.getAge());
    }
}
