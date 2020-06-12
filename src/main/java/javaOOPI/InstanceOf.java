package javaOOPI;

public class InstanceOf {
    public static void main (String[] args) {
        String name = "Liel Phantomtairy";
        Integer age = 24;

        System.out.println("Is name an instance of String: "+ (name instanceof String));
        System.out.println("Is age an instance of Integer: "+ (age instanceof Integer));
    }
}
