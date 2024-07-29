package exercise;

import java.security.SecureRandom;

public class Exercise18GameCraps {
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

    // plays one game of craps
    public static void main(String[] args) {
        // constants that represent common rolls of the dice
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        gameStatus = checkResult(sumOfDice, myPoint);
        myPoint = sumOfDice;

        while (gameStatus == Status.CONTINUE) {
            gameStatus = continueGame(myPoint);
        }

        displayWonLose(gameStatus);
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

    public static Status checkResult(int sumOfDice, int myPoint) {
        // Para testar a primeira jogada
        switch (sumOfDice) {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN:  // win with 11 on first roll
                return Status.WON;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                return Status.LOST;
            default: // did not win or lose, so remember point
                showMyPoint(sumOfDice, myPoint);
                return Status.CONTINUE;
        }
    }

    public static void showMyPoint(int sumOfDice, int myPoint) {
        // remember the point
        System.out.printf("Point is %d%n", myPoint);
    }

    public static Status continueGame(int myPoint) {
        // while game is not complete
        // not WON or LOST
        int sumOfDice = rollDice(); // roll dice again

        // determine game status
        if (sumOfDice == myPoint) { // win by making point
            return Status.WON;
        }
        if (sumOfDice == SEVEN) { // lose by rolling 7 before point
            return Status.LOST;
        }
        return Status.CONTINUE;
    }

    // display won or lost message
    public static void displayWonLose(Status gameStatus) {
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }
    }

}
