package java_flow_control;

public class JavaIfElseStatement {
    public static void main(String[] args) {
        int n = 1717;


        if (n <= 2000) {
            System.out.println("What a big number owO");
        } else {
            System.out.println("There there little one :3");
        }


        Double saw7 = -3.1, saw8 = 9.5, saw9 = -7.7, biggestNumber;
        if (saw7 >= saw8){
            if (saw7 >= saw9) {
                biggestNumber = saw7;
            }
            else {
                biggestNumber = saw9;
            }

        }
        else {

            if (saw8 >= saw9) {
                biggestNumber = saw8;
            }
            else {
                biggestNumber = saw9;

            }
        }
        System.out.println(biggestNumber + " is the best number! Yayz!");

    }

}
