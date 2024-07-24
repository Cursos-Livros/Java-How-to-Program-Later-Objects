package exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise29CoinTossing {
    private enum Coin {HEAD, TAIL};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();

        System.out.println("Press 1 to toss coin or 0 to cancel:");
        boolean start = checkNumber(input);

        if (start) {
            tossCoin(randomNumbers);
        }
    }

    public static boolean checkNumber(Scanner input) {
        int numberToCheck = input.nextInt();

        if (!checkToss(numberToCheck)) {
            return changeToAbleNumber(input, numberToCheck);
        }

        return true;
    }

    public static boolean checkToss(int numberToCheck) {
        return numberToCheck == 0 || numberToCheck == 1;
    }

    public static boolean changeToAbleNumber(Scanner input, int numberToCheck) {
        int numberToChange = numberToCheck;

        while (numberToChange != 1 && numberToChange != 0) {
            System.out.println("Error! Enter a number 1 or 0 to cancel!");
            System.out.println("Enter the number again");
            numberToChange = input.nextInt();
            if (numberToChange == 0) {
                return false;
            }
        }

        return true;
    }

    public static void tossCoin(SecureRandom randomNumbers) {
        int coin = 0;
        int head = 0;
        int tail = 0;
        for (int i = 0; i < 1000; i++) {
            coin = 1 + randomNumbers.nextInt(2);
            if (coin == 1) {
                System.out.println("HEAD");
                head += 1;
            } else {
                System.out.println("Tail");
                tail += 1;
            }
        }
        showReport(head, tail);
    }

    public static void showReport(int head, int tail) {
        System.out.println("Number heads: " +  head);
        System.out.println("Number tails: " +  tail);
    }
}
