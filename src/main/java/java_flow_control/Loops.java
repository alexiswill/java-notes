package java_flow_control;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; ++i) {
            System.out.println("Line " + i);
        }


        int sum = 0;

        for (int i = 1; i <= 1000; ++i) {
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);


        //for each

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char item: vowels) {
            System.out.println(item);
        }


        int[] numbers = {3, 4, 5, -5, 0, 12};
        int q = 0;

        for (int number: numbers) {
            q += number;
        }

        System.out.println("q = " + q);


        int sd = 1;

        while (sd <= 10) {
            System.out.println("Line " + sd);
            ++sd;
        }
        int s = 0, i = 100;

        while (i != 0) {
            s += i;     // sum = sum + i;
            --i;
        }

        System.out.println("S = " + s);

//        Do while

        Double number, num = 0.0;
        // creates an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {

            // takes input from the user
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            num += number;
        } while (number != 0.0);  // test expression

        System.out.println("num = " + num);


//        continue
        for (int l = 1; l <= 10; ++l) {

            // if value of i is between 4 and 9, continue is executed
            if (l > 4 && l < 9) {
                continue;
            }
            System.out.println(i);
        }
        // the outer for loop is labeled as label
        first:
        for (int j = 1; j < 6; ++j) {
            for (int k = 1; k < 5; ++k) {
                if (j == 3 || k== 2)

                    // skips the iteration of label (outer for loop)
                    continue first;
                System.out.println("j = " + j + "; k = " + k);
            }
        }
    }
    }



