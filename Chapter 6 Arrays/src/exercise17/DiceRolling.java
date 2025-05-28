package exercise17;

import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random face = new Random();
        int dice1 = 0;
        int dice2 = 0;

        int[][] combinationArray = new int[6][6];
        int counter = 0;

        while (counter != 36) {
            dice1 = face.nextInt(6) + 1;
            dice2 = face.nextInt(6) + 1;

            combinationArray[dice1 - 1][dice2 - 1] += 1;

            counter += 1;
        }


        showArray(combinationArray);
    }

    static void showArray(int[][] combinationArray) {
        for (int i = 0; i < combinationArray.length; i++) {
            for (int j = 0; j < combinationArray.length; j++) {
                System.out.printf("%d, ", combinationArray[i][j]);
            }
            System.out.println();
        }
    }
}
