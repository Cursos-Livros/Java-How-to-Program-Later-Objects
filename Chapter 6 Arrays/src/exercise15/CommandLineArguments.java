package exercise15;

import java.util.Arrays;
import java.util.Scanner;

public class CommandLineArguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] commandLineList = new int[5];

        for (int i = 0; i < commandLineList.length; i++) {
            System.out.println("Enter the number");
            commandLineList[i] = input.nextInt();
        }

        sortArray(commandLineList);
        double average = average(commandLineList[0], commandLineList.length - 1);
        showArray(commandLineList);
        System.out.println("The average of the first and last elements it's: " + average);
    }


    static void sortArray(int... commandLineList) {
        int temporary = 0;

        for (int i = 0; i < commandLineList.length; i++) {
            for (int j = i + 1; j < commandLineList.length; j++) {
                if (commandLineList[j] < commandLineList[i]) {
                    temporary = commandLineList[i];
                    commandLineList[i] = commandLineList[j];
                    commandLineList[j] = temporary;
                }
            }
        }
    }

    static double average(int firstElement, int lastElement) {
        return (double) (firstElement + lastElement) / 2;
    }

    static void showArray(int... commandLineList) {
        System.out.println(Arrays.toString(commandLineList));
    }
}
