package exercises.exercise38;

import java.util.Locale;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the non negative number:");
        int number = input.nextInt();

        while (number < 0) {
            System.out.println("Enter the non negative number again:");
            number = input.nextInt();
        }

        int fatorial = 1;
        for (int i = number; i > 0; i--) {
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
