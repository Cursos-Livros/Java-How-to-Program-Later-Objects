package exercises.exercise30;

import java.util.Locale;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the number between 10000 and 99999. If the number not was in this interval, the " +
                "program will be generate a error.");
        int number = input.nextInt();

        while(number < 10000 || number > 99999){
            System.out.println("Error, interval between number is incorrect.");
            System.out.println("Enter at another number:");
            number = input.nextInt();
        }

        int temporary = number;
        int reverseNumber = 0;

        while(number > 0){
            int digit = number % 10; // Remove um digito  técnica do resto, o resto é do primeiro operando dividido
            // pelo segundo
            reverseNumber = (reverseNumber * 10) + digit;// Adiciona mais uma ordem a qualquer numero que vier,
            // exemplo (numero 121): (0 * 10) + 1 = 1 / (1*10) = 10 + 2 = 12 / (12 * 10) = 120 + 1 = 121
            number = number / 10;
        }

        if(reverseNumber == temporary){
            System.out.println("Is Palindrome!");
        }else {
            System.out.println("Not a Palindrome!");
        }
    }
}
