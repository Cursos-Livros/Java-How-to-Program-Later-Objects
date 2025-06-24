package exercise20;

import java.security.SecureRandom;

public class ArcheryGame {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        double[][] score = new double[4][3];
        double[] total = new double[4];

        score = getScore(score);
        total = calculateTotal(score);
        int winner = getWinner(total);

        displayScore(score, total, winner);
    }

    public static double[][] getScore(double[][] score) {
        SecureRandom point = new SecureRandom();
        double[][] temporaryScore = new double[score.length][score[0].length]; // score[0].length para acessar o tamanho da posição do
        // array interno

        for (int player = 0; player < score.length; player++) {
            for (int pointMake = 0; pointMake < score[player].length; pointMake++) {
                temporaryScore[player][pointMake] = point.nextDouble(10);
            }
        }

        return temporaryScore;
    }

    public static double[] calculateTotal(double[][] score) {
        double[] totalPoints = new double[4];

        for (int player = 0; player < score.length; player++) {
            for (int point = 0; point < score[player].length; point++) {
                totalPoints[player] += score[player][point];
            }
        }

        return totalPoints;
    }

    public static int getWinner(double[] total) {
        int player = 0;
        double tempTotal = 0;
        double[] temporaryScore = total;

        for (int i = 0; i < temporaryScore.length; i++) {
            for (int j = i + 1; j < temporaryScore.length; j++) {
                if (temporaryScore[j] > temporaryScore[i]) {
                    tempTotal = temporaryScore[i];
                    temporaryScore[i] = temporaryScore[j];
                    temporaryScore[j] = tempTotal;
                    player = j;
                }
            }
        }

        return player;
    }

    public static void displayScore(double[][] score, double[] total, int winner) {
        System.out.printf("---------- Score ----------\n");
        System.out.printf("            Chance 1   |   Chance 2   |   Chance 3    |   Total\n");

        for (int player = 0; player < score.length; player++) {
            System.out.printf("Player %d: %9.2f    %9.2f      %9.2f       %9.2f\n", player + 1, score[player][0], score[player][1],
                    score[player][2], total[player]);
        }

        System.out.println();
        System.out.printf("the winner is player %d", winner + 1);
    }
}
