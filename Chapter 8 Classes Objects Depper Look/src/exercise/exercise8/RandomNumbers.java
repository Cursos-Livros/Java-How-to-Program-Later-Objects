package exercise.exercise8;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumber = new SecureRandom();

        System.out.println("How many number you need generate?");
        int numbersToGenerate = input.nextInt();

        ArrayList<Integer> arrayRandomNumber = new ArrayList<>();

        fillArray(arrayRandomNumber, numbersToGenerate, randomNumber);

        showList(arrayRandomNumber);
    }

    public static ArrayList<Integer> fillArray(ArrayList<Integer> randomNumberlist, int numbersToGenerate,
                                               SecureRandom randomNumber) {
        for (int number = 0; number < numbersToGenerate; number++) {
            int randomNumberGenerated = 1 + randomNumber.nextInt(100);
            randomNumberlist.add(randomNumberGenerated );
        }
        return randomNumberlist;
    }

    public static void showList(ArrayList<Integer> randomNumberLists){
        for (Integer number : randomNumberLists) {
            System.out.println(number);
        }
    }
}
