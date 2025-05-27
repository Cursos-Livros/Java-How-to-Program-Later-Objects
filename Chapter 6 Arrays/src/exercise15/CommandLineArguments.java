package exercise15;

import java.util.Scanner;

public class CommandLineArguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] commandLineList = new int[10];

        for (int element : commandLineList) {
            System.out.println("Enter the number");
            commandLineList[element] = input.nextInt();
        }

        sortArray(commandLineList);
    }

    // Não use varargs não por favor
    static void sortArray(int... commandLineList) {

    }
}
