package exercise;

import java.util.Scanner;

public class Exercise34TableBinaruOctalHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number 1 to 256");
        int number = checkNumber(input);

        String binary = convertBinary(number);
        String octal = convertOctal(number);
        String hexadecimal = convertHexadecimal(number);

        System.out.println(number + " to binary is: " + binary);
        System.out.println(number + " to octal is: " + octal);
    }

    public static int checkNumber(Scanner input) {
        int numberToCheck = input.nextInt();

        if (checkToss(numberToCheck)) {
            return changeToAbleNumber(input, numberToCheck);
        }

        return numberToCheck;
    }

    public static boolean checkToss(int numberToCheck) {
        return numberToCheck < 0 || numberToCheck > 256;
    }

    public static int changeToAbleNumber(Scanner input, int numberToCheck) {
        int numberToChange = numberToCheck;

        while (checkToss(numberToChange)) {
            System.out.println("Error! Enter a number 1 to 256!");
            System.out.println("Enter the number again");
            numberToChange = input.nextInt();
        }

        return numberToChange;
    }

    public static String convertBinary(int number) {
        String binary = "";

        while (number > 0) {
            binary = ((number % 2) == 0 ? "0" : 1) + binary;
            number /= 2;
        }

        return binary;
    }

    public static String convertOctal(int number) {
        int quotient = number;
        int remainder = 0;

        StringBuilder octal = new StringBuilder();

        while (quotient > 0) {
            remainder = quotient % 8;
            quotient /= 8;
            octal.insert(0, remainder);
            //octal += remainder;
        }

        return octal.toString();
    }

    public static String convertHexadecimal(int number) {
       return Integer.toHexString(number);
    }
}
