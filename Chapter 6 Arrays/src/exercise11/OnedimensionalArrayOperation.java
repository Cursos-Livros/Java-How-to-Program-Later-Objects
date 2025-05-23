package exercise11;

import java.util.Arrays;
import java.util.Random;

public class OnedimensionalArrayOperation {
    public static void main(String[] args) {
        int[] arrayScores = new int[20];

        arrayScores = generateScores(arrayScores);
        setToZero(arrayScores);
        multiply2(arrayScores);
        setScore(arrayScores);
        showBestScore(arrayScores);
    }

    public static int[] generateScores(int[] arrayScores) {
        Random random = new Random();
        int randomScore = random.nextInt(100);

        int[] temporaryArrayScores = arrayScores;

        for (int i = 0; i < temporaryArrayScores.length; i++) {
            temporaryArrayScores[i] = randomScore;
            randomScore = random.nextInt(100);
        }

        return temporaryArrayScores;
    }

    public static void setToZero(int[] arrayScores) {
        for (int i = 9; i < arrayScores.length; i++) {
            arrayScores[i] = 0;
        }
    }

    public static void multiply2(int[] arrayScores) {
        for (int i = 0; i < arrayScores.length; i++) {
            arrayScores[i] *= 2;
        }
    }

    // E um problema de bubble sort
    public static int[] setScore(int[] arrayScore) {
        int[] bestScore = arrayScore;

        for (int i = 0; i < bestScore.length - 1; i++) {
            for (int j = 0; j < bestScore.length - i - 1; j++) {
                if (bestScore[j] < bestScore[j + 1]) {
                    int temp = bestScore[j];
                    bestScore[j] = bestScore[j + 1];
                    bestScore[j + 1] = temp;
                }
            }
        }

        return bestScore;
    }

    public static void showBestScore(int[] arrayScore) {
        System.out.println(Arrays.toString(arrayScore));
    }
}