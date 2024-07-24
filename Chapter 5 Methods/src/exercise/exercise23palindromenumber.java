package exercise;

import java.util.Scanner;

public class exercise23palindromenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to test is palindrome:");
        int number = checkNumber(input);

        boolean isPalindrome = checkPalindrome(number);

        System.out.println("The number " + number + " is a palindrome? " + isPalindrome );
        input.close();
    }

    public static int checkNumber(Scanner input) {
        int numberToCheck = input.nextInt();

        if (!checkIsPositive(numberToCheck)) {
            return changeToPositive(input, numberToCheck);
        }

        return numberToCheck;
    }

    public static boolean checkIsPositive(int numberToCheck) {
        return numberToCheck > 0;
    }

    public static int changeToPositive(Scanner input, int numberToCheck) {
        int numberToChange = numberToCheck;

        while (numberToChange <= 0) {
            System.out.println("Error! Enter a number greater than 0!");
            System.out.println("Enter the number again");
            numberToChange = input.nextInt();
        }

        return numberToChange;
    }

    public static boolean checkPalindrome(int number) {
        int temporary = number;
        int reverseNumber = 0;

        while (number > 0) {
            int digit = number % 10; // Remove um digito  técnica do resto, o resto é do primeiro operando dividido
            // pelo segundo
            reverseNumber = (reverseNumber * 10) + digit;// Adiciona mais uma ordem a qualquer numero que vier,
            // exemplo (numero 121): (0 * 10) + 1 = 1 / (1*10) = 10 + 2 = 12 / (12 * 10) = 120 + 1 = 121
            number = number / 10;
        }

        if (reverseNumber == temporary) {
            return true;
        }
        return false;
    }
}
