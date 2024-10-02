package exercise.exercise14;

import java.util.Scanner;

public class SetIntegerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char option = ' ';

        System.out.println("What the size of the list");
        System.out.println("Enter number between 1 and 10");
        int sizeList = input.nextInt();
        while (!testSize(sizeList)) {
            int sizeListError = sizeList;
            // Você esqueceu de alterar o size list que é testado dentro da funcao test size
            sizeList = fixTestSize(sizeListError, input);
        }

        System.out.println("Enter the integer");
        int integer = input.nextInt();
        SetInteger integerSet = new SetInteger(integer - 1, sizeList);

        while (option != 'q') {
            System.out.println("Enter the new integer");
            integer = input.nextInt();

            integerSet.setInteger(integer - 1);
            System.out.println(integerSet.showSetInteger());

            System.out.println("Want to stop");
            option = input.next().charAt(0);

        }
        input.close();
    }

    public static Boolean testSize(int sizeOption) {
        return sizeOption > 0 && sizeOption <= 10;
    }

    public static Integer fixTestSize(int sizeOption, Scanner input) {
        int newSizeOption = sizeOption;
        do {
            System.out.println("This number " + newSizeOption + " it's not permmited");
            System.out.println("Enter a new number:");
            newSizeOption = input.nextInt();
            testSize(newSizeOption);
        } while (!testSize(newSizeOption));
        return newSizeOption;
    }
}
