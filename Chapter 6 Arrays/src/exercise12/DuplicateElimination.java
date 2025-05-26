package exercise12;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];
        fillWithMinus1(array);

        int number = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter with the %d number:", i + 1);
            System.out.println("Remember the numbers needs to be 10 and 20 inclusive.");
            number = input.nextInt();

            if (!testNumber(number)) {
                number = fixNumber(number);
            }

            array[i] = number;
        }

        sortArray(array);
        eliminateDuplication(array);
        showArray(array);
    }

    public static void fillWithMinus1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }

    public static boolean testNumber(int number) {
        return number >= 10 && number <= 20;
    }

    public static int fixNumber(int number) {
        Scanner input = new Scanner(System.in);

        int temporaryNumber = number;

        while (!testNumber(temporaryNumber)) {
            System.out.println("Please enter the number again!");
            System.out.println("Remember the numbers needs to be 10 and 20 inclusive.");
            temporaryNumber = input.nextInt();
        }

        return temporaryNumber;
    }

    public static void sortArray(int[] array) {
        int temporary = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
    }

    public static void eliminateDuplication(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    array[j] = -1;
                }
            }
        }
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }

            if (array[i] != -1) {
                if (i < array.length - 1) {
                    System.out.printf("%d,", array[i]);
                } else {
                    System.out.printf("%d]", array[i]);
                }
            }
        }
    }
}
