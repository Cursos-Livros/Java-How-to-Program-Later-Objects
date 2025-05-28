package exercise18;

import java.security.SecureRandom;

public class GameCraps {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

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

        int sumOfDice = rollDice();
        gameStatus = firstRoll(sumOfDice);

        if (gameStatus == Status.CONTINUE) { // did not win or lose, so remember the point
            myPoint = sumOfDice; // remember the point
        }


        // While game is not complete
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
        }

        // display won or lost message
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }
    }

    // function that implements the first roll
    public static Status firstRoll(int sumOfDice) {
        // determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                return Status.WON;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                return Status.LOST;
            default: // did not win or lose, so remember the point
                System.out.printf("Point is %d%n", sumOfDice);
                return Status.CONTINUE; // game is not over
        }
    }

    // roll dice calculate sum and display results
    public static int rollDice() {
        // pick random dice values
        int dice1 = 1 + randomNumbers.nextInt(6); // first dice roll
        int dice2 = 1 + randomNumbers.nextInt(6); // second dice roll

        int sum = dice1 + dice2; // sum of dice values

        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);

        return sum;
    }
}
