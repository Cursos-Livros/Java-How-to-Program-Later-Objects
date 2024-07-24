package exercise;

import java.util.Scanner;

public class exercise25primenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = checkNumber(input);

        System.out.println(checkPrimeNumber(number));
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

    public static boolean checkPrimeNumber(int number) {
        int sumDivisors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sumDivisors += 1;
            }
        }
        return sumDivisors == 2;
    }
}
