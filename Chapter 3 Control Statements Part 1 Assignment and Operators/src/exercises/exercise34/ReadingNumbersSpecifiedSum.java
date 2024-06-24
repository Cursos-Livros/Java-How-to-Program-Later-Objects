package exercises.exercise34;

import java.util.Locale;
import java.util.Scanner;

public class ReadingNumbersSpecifiedSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the binary number:");
        int targetNumber = input.nextInt();

        int newNumber = 0;

        while (newNumber < targetNumber) {
            System.out.println("This is not the correct number:");
            System.out.println("Try again!");
            int number = input.nextInt();

            newNumber += number;
        }
    }
}
