package exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise30GuessTheNumber {
    private enum Status {WIN, LOST, NULL}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        Status gameStatus = Status.NULL;

        int randomNumber = 1 + randomNumbers.nextInt(1000);

        System.out.println(randomNumber);

        System.out.println("Enter with you guess:  The number mst be between 1 to 1000");
        int guess = checkGuess(input);

        while (gameStatus != Status.WIN) {
            gameStatus = checkStatus(guess, randomNumber);
            if (gameStatus != Status.WIN) {
                System.out.println("Enter the number again");
                guess = checkGuess(input);
            }
        }
    }

    public static int checkGuess(Scanner input) {
        int numberToCheck = input.nextInt();

        if (!checkIs1Or1000(numberToCheck)) {
            return changeToValidNumber(input, numberToCheck);
        }

        return numberToCheck;
    }

    public static boolean checkIs1Or1000(int numberToCheck) {
        return numberToCheck >= 1 && numberToCheck <= 1000;
    }

    public static int changeToValidNumber(Scanner input, int numberToCheck) {
        int numberToChange = numberToCheck;

        while (numberToChange <= 0 || numberToChange > 1000) {
            System.out.println("Error! Enter a number between 1 to 1000!");
            System.out.println("Enter the number again");
            numberToChange = input.nextInt();
        }

        return numberToChange;
    }

    public static Status checkStatus(int guess, int randomNumber) {
        if (guess != randomNumber) {
            checkGuessAgain(guess, randomNumber);
            return Status.LOST;
        }
        System.out.println("Congratulations! You guessed the number!");
        return Status.WIN;
    }

    public static void checkGuessAgain(int guess, int randomNumber) {
        if (guess > randomNumber) {
            System.out.println("Its too high!");
        }

        if (guess < randomNumber) {
            System.out.println("Its too Low!");
        }
    }
}
