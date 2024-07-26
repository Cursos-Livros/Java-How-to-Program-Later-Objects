package exercise;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise17DiceRolling {
    public static void main(String[] args) {
        SecureRandom side = new SecureRandom();

        // Troque de object para um tipo valor como int
        Integer[] resultSumDice = new Integer[13];

        // Inicializando o array com zeros
        // Para iniciar com 0 tem que se usar o array sem um object
        for (int i = 0; i < 13; i++) {
            resultSumDice[i] = 0;
        }

        int dice1;
        int dice2;
        int sumSide;

        for (int i = 0; i < 10000; i++) {
            dice1 = sideGenerator(side);
            dice2 = sideGenerator(side);
            sumSide = sumDiceSide(dice1, dice2);
            resultSumDice[sumSide]++;
        }

        showResult(resultSumDice);
    }

    public static int sideGenerator(SecureRandom randomNumber) {
        int number = 1 + randomNumber.nextInt(6);
        return number;
    }

    public static int sumDiceSide(int sideDice1, int sideDice2) {
        return sideDice1 + sideDice2;
    }

    public static void showResult(Integer[] resultSumDice) {
        System.out.printf("%-10s%-10s%n", "Sum", "Frequency");
        for (int i = 2; i < resultSumDice.length; i++) {
            System.out.printf("%-10d%-10d%n", i, resultSumDice[i]);
        }
    }
}
