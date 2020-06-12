package javaOOPIII;

enum Siz {

    // enum constants calling the enum constructors
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    // private enum constructor
    private Siz(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSiz() {
        return pizzaSize;
    }
}

class Main {
    public static void main(String[] args) {
        Siz siz = Siz.SMALL;
        System.out.println(siz.getSiz());
    }
}
