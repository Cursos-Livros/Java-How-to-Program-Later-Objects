package example;

import java.security.SecureRandom;

public class Example4Craps {
    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST};

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // plays one game of craps
    public static void main(String[] args) {
        // constants that represent common rolls of the dice
        int myPoint  = 0;
        Status gameStatus;

       // int sumOfDice = rollDice();

//        switch (sumOfDice){
//            case SEVEN: // win with 7 on first roll
//            case YO_LEVEN:  // win with 11 on first roll
//                gameStatus = Status.WON;
//                break;
//            case SNAKE_EYES: // lose with 2 on first roll
//            case TREY: // lose with 3 on first roll
//            case BOX_CARS: // lose with 12 on first roll
//                gameStatus = Status.LOST;
//                break;
//            default: // did not win or lose, so remember point
//                gameStatus = Status.CONTINUE; // game is not over
//                myPoint = sumOfDice; // remember the point
//                System.out.printf("Point is %d%n", myPoint);
//                break;

        }
    }

