package exercise.exercise11;

import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the number of numbers to includding:");
        int numberIncludes = input.nextInt();

        System.out.println("Enter the 1st number:");
        int number = input.nextInt();
        int minimumValue = number;
        int maximumValue = number;

        for (int i = 0; i < (numberIncludes - 1); i++) {
            System.out.println("Enter with the " + (i + 1) + " number:");
            number = input.nextInt();

            if (number > maximumValue) {
                maximumValue = number;
            } else if (number < minimumValue) {
                minimumValue = number;
            }
        }

        System.out.println("The maximum number and the minimum number is: " + minimumValue + " " + maximumValue);
        System.out.println("Total sum of maximum and the minimum number is: " + (minimumValue + maximumValue));
    }
}
