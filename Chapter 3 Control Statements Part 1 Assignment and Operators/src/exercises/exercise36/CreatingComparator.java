package exercises.exercise36;

import java.util.Locale;
import java.util.Scanner;

public class CreatingComparator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number 1:");
        int number1 = input.nextInt();

        System.out.println("Enter the number 2:");
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println(0);
        } else if (number1 > number2) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
