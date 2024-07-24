package exercise;

import example.Example4Craps;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise33CapsGameModification {
    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // Tipo especial da classe para declarar varia constantes
    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST}

    ;

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // plays one game of craps
        // constants that represent common rolls of the dice
        int myPoint = 0;
        Status gameStatus;
        double bankBalance = 1000;

        System.out.println("Enter a Wagger");
        double wagger = checkWagger(input, bankBalance);


        int sumOfDice = rollDice();

        // Para testar a primeira jogada
        switch (sumOfDice) {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN:  // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        boolean newTry;

        // while game is not complete
        while (gameStatus == Status.CONTINUE) { // not WON or LOST
            sumOfDice = rollDice(); // roll dice again


            // determine game status
            if (sumOfDice == myPoint) { // win by making point
                gameStatus = Status.WON;
            }
            if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                gameStatus = Status.LOST;
            }
            newTry = rungame(input);

            if (!newTry) {
                break;
            }
        }

        // display won or lost message
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
            bankBalance += wagger;
            System.out.println("You new bank balance is:" + bankBalance);
        } else {
            bankBalance -= wagger;
            System.out.println("Player loses");
            System.out.println("You new bank balance is:" + bankBalance);
        }
    }

    public static double checkWagger(Scanner input, double bankBalance) {
        double wagger = input.nextDouble();

        if (!checkValueWagger(wagger, bankBalance)) {
            return changeWagger(wagger, bankBalance, input);
        }

        return wagger;
    }

    public static boolean checkValueWagger(double wagger, double bankBalance) {
        return wagger >= 0 && (wagger <= bankBalance);
    }

    public static double changeWagger(double wagger, double bankBalance, Scanner input) {
        double newWagger = wagger;

        while (!checkValueWagger(newWagger, bankBalance)) {
            System.out.println("The wagger its not permmited! Enter a new wagger");
            newWagger = input.nextDouble();
            checkValueWagger(newWagger, bankBalance);
        }
        return newWagger;
    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2; // sum of die values

        // display results of this roll

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static boolean rungame(Scanner input) {
        System.out.println("You wish one more dice?");
        System.out.println("enter Y for yes and N to no:");
        char option = input.next().charAt(0);

        if (!checkOption(option)) {
            if (changeOption(option, input) == 'n') {
                return false;
            }
        }

        if (option == 'n') {
            return false;
        }

        return true;
    }

    public static boolean checkOption(char option) {
        return option == 'y' || option == 'n';
    }

    public static char changeOption(char option, Scanner input) {
        char newOption = option;

        while (!checkOption(newOption)) {
            System.out.println("Its y or n!");
            System.out.println("Enter the value again:");
            newOption = input.next().charAt(0);
            checkOption(newOption);
        }
        return newOption;
    }
}
