package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise15CommandLineArguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What the quantity of number you'll pass:");
        int quantityNumbers = input.nextInt();

        Integer[] arrayNumber = fillList(quantityNumbers, input);

        System.out.println("That's your minimum and maximum element:");
        int minimum = findMinimum(arrayNumber);
        int maximum = findMaximum(arrayNumber);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        System.out.println("Average: " + (maximum + minimum) / 2);

        input.close();
    }

    public static Integer[] fillList(int size, Scanner input) {
        Integer[] listCalculate = new Integer[size];

        for (int i = 0; i < listCalculate.length; i++) {
            listCalculate[i] = input.nextInt();
        }

        return listCalculate;
    }

    public static Integer findMinimum(Integer[] arrayNumber) {
        int minimum = arrayNumber[0];

        for (int value : arrayNumber) {
            if (value < minimum) {
                minimum = value;
            }
        }

        return minimum;
    }

    public static Integer findMaximum(Integer[] arrayNumber) {
        int maximum = arrayNumber[0];

        for (int value : arrayNumber) {
            if (value > maximum) {
                maximum = value;
            }
        }

        return maximum;
    }

    public static Double calculateAverage(Integer[] arrayNumber) {
        double average = 0.0;

        for (Integer integer : arrayNumber) {
            average += integer.doubleValue();
        }

        return average / arrayNumber.length;
    }

}
