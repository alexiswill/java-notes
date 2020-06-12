package javaOOPIII;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
    Size pizzaSize;
    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza() {
        switch(pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small size pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }
}

class EnumClass{
    public static void main(String[] args) {
        Test t1 = new Test(Size.MEDIUM);
        t1.orderPizza();
    }
}

//enum Size{
//    SMALL, MEDIUM, LARGE, EXTRALARGE;
//
//    public String getSize() {
//
//        // this will refer to the object SMALL
//        switch(this) {
//            case SMALL:
//                return "small";
//
//            case MEDIUM:
//                return "medium";
//
//            case LARGE:
//                return "large";
//
//            case EXTRALARGE:
//                return "extra large";
//
//            default:
//                return null;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        // calling the method getSize() using the object SMALL
//        System.out.println("The size of the pizza is " + Size.SMALL.getSize());
//    }
//}
