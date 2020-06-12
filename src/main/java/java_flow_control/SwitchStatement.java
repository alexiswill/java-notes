package java_flow_control;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        int BestBoi = 5;
        String boi;

        // switch statement to check day
        switch (BestBoi) {
            case 1:
                boi = "Masato";
                break;
            case 2:
                boi = "Cecil";
                break;
            case 3:
                boi = "Tokiya";
                break;

            // match the value of week
            case 4:
                boi = "Syo";
                break;
            case 5:
                boi = "Ren";
                break;
            case 6:
                boi = "Natsuki";
                break;
            case 7:
                boi = "Otoya";
                break;
            default:
                boi = "Incorrect Boi";
                break;
        }
        System.out.println("Sorry guys but " + boi + " is the Best Boi!");

//        char operator;
//        Double number1, number2, result;
//
//        // create an object of Scanner class
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter operator (either +, -, * or /): ");
//
//        // ask user to enter operator
//        operator = scanner.next().charAt(0);
//        System.out.print("Enter number1 and number2 respectively: ");
//
//        // ask user to enter numbers
//        number1 = scanner.nextDouble();
//        number2 = scanner.nextDouble();
//
//        switch (operator) {
//
//            // performs addition between numbers
//            case '+':
//                result = number1 + number2;
//                System.out.print(number1 + "+" + number2 + " = " + result);
//                break;
//
//            // performs subtraction between numbers
//            case '-':
//                result = number1 - number2;
//                System.out.print(number1 + "-" + number2 + " = " + result);
//                break;
//
//            // performs multiplication between numbers
//            case '*':
//                result = number1 * number2;
//                System.out.print(number1 + "*" + number2 + " = " + result);
//                break;
//
//            // performs division between numbers
//            case '/':
//                result = number1 / number2;
//                System.out.print(number1 + "/" + number2 + " = " + result);
//                break;
//
//            default:
//                System.out.println("Invalid operator!");
//                break;
//        }
    }
}



