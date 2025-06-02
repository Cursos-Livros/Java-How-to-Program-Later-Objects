package exercise18;

import java.security.SecureRandom;
import java.util.Arrays;

public class GameCraps {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, WONFIRSTROLL, LOST}

    ;

    // constants that represent commom rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WIN or LOST
        int[] listNumberGamesWonEachRound = new int[11];
        int[] listNumberGamesLostEachRound = new int[11];


        for (int i = 0; i < 10; i++) {
            int roll = 0;
            int sumOfDice = rollDice();
            gameStatus = firstRoll(sumOfDice);

            if (gameStatus == Status.WONFIRSTROLL) {
                listNumberGamesWonEachRound[0] += 1;
            }

            // While game is not complete
            while (gameStatus == Status.CONTINUE) {
                myPoint = sumOfDice;
                gameStatus = continuePlaying(myPoint);
                roll += 1;
            }

            int lastPositionList = listNumberGamesWonEachRound.length - 1;
            if (roll > listNumberGamesWonEachRound.length) {
                roll = lastPositionList;
            }

            // display won or lost message
            if (gameStatus == Status.WON) {
                listNumberGamesWonEachRound[roll] += 1;
            } else {
                listNumberGamesLostEachRound[roll] += 1;
            }
        }

        System.out.println("Wins:");
        showListNumberResultsEachRound(listNumberGamesWonEachRound);
        System.out.println("Lost:");
        showListNumberResultsEachRound(listNumberGamesLostEachRound);
    }

    // roll dice calculate sum and display results
    public static int rollDice() {
        // pick random dice values
        int dice1 = 1 + randomNumbers.nextInt(6); // first dice roll
        int dice2 = 1 + randomNumbers.nextInt(6); // second dice roll

        int sum = dice1 + dice2;

        return sum;
    }

    // function that implements the first roll
    public static Status firstRoll(int sumOfDice) {
        // determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                return Status.WONFIRSTROLL;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                return Status.LOST;
            default: // did not win or lose, so remember the point
                return Status.CONTINUE; // game is not over
        }
    }

    public static Status continuePlaying(int myPoint) {
        int sumOfDice = rollDice();

        if (sumOfDice == myPoint) {
            return Status.WON;
        } else {
            if (sumOfDice == SEVEN) {
                return Status.LOST;
            }
        }
        return Status.CONTINUE;
    }

    public static void showListNumberResultsEachRound(int[] listNumberResultsEachRound) {
        System.out.println(Arrays.toString(listNumberResultsEachRound));
    }

}
