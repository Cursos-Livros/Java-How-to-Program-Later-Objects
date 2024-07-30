package exercise;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise20ArcheryGame {
    public static final int NUMBER_PLAYERS = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom archShot = new SecureRandom();

        Integer[][] score = new Integer[NUMBER_PLAYERS][NUMBER_PLAYERS];

        game(archShot, score);

        showScore(score);
    }

    public static void game(SecureRandom archShot, Integer[][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                int shot = 1 + archShot.nextInt(10);
                score[i][j] = shot;
            }
        }
    }

    public static void showScore(Integer[][] score) {
        for (int player = 0; player < NUMBER_PLAYERS; player++) {
            int totalScore = 0;
            System.out.printf("Player %d: ", (player + 1));
            for (int point = 0; point < NUMBER_PLAYERS; point++) {
                System.out.printf(" %d  ", score[player][point]);
                totalScore += score[player][point];
            }
            System.out.printf(" %d", totalScore);
            System.out.println();
        }
    }
}
