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
    }

    // roll dice calculate sum and display results
    public static int rollDice() {
        // pick random dice values
        int dice1 = 1 + randomNumbers.nextInt(6);
        int dice2 = 1 + randomNumbers.nextInt(6);

        int sum = dice1 + dice2;

        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);

        return sum;
    }
}
