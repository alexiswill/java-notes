package arrays;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {


        //example1
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] positiveNumbers = numbers;    // copying arrays

        for (int number : positiveNumbers) {
            System.out.print(number + ", ");
        }


        int[] num = {1, 2, 3, 4, 5, 6};
        int[] pn = num;    // copying arrays

        // change value of first array
        num[0] = -1;

        // printing the second array
        for (int n : pn) {
            System.out.print(n + ", ");
        }

        //example2
        int[] source = {1, 2, 3, 4, 5, 6};
        int[] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }

        // converting array to string
        System.out.println(Arrays.toString(destination));


        //example3 copy array with loop
        int[] n1 = {2, 3, 12, 4, 12, -2};

        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];

        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));




        //copyOfRange() method

        int[] array = {2, 3, 12, 4, 12, -2};

        // copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(array, 0, array.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));

        // copying from index 2 to 5 (5 is not included)
        int[] destination2 = Arrays.copyOfRange(array, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));
    }
}


