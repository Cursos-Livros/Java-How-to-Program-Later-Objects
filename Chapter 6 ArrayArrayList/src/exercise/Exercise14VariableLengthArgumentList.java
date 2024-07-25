package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise14VariableLengthArgumentList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What the quantity of number you'll pass:");
        Integer quantityNumbers = input.nextInt();

        Integer[] arrayNumber = fillList(quantityNumbers, input);

        System.out.println("That's your list:");
        System.out.println(Arrays.toString(arrayNumber));

        System.out.println("Average: " + calculateAverage(arrayNumber));

        input.close();
    }

    public static Integer[] fillList(int size, Scanner input) {
        Integer[] listCalculate = new Integer[size];

        for (int i = 0; i < listCalculate.length; i++) {
            listCalculate[i] = input.nextInt();
        }

        return listCalculate;
    }

    public static Double calculateAverage(Integer[] arrayNumber) {
        double average = 0.0;

        for (Integer integer : arrayNumber) {
            average += integer.doubleValue();
        }

        return average / arrayNumber.length;
    }
}
