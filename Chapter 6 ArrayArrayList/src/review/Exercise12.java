package review;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the quantity of number to eliminate duplicates:");
        int sizeSet = input.nextInt();

        int[] setNumbers = new int[sizeSet];

        setNumbers = fillSetNumberEmptyElement(sizeSet);

        for (int i = 0; i < setNumbers.length; i++) {
            System.out.printf("Enter with the number %d:", i + 1);
            setNumbers[i] = input.nextInt();
        }

        eliminateDuplication(setNumbers);
    }

    public static int[] fillSetNumberEmptyElement(int sizeSet) {
        int[] temporaryArray = new int[sizeSet];

        for (int i = 0; i < temporaryArray.length; i++) {
            temporaryArray[i] = -1;
        }

        return temporaryArray;
    }

    public static void eliminateDuplication(int[] setNumbers) {
        int[] arrayRemoveDuplication = setNumbers;
    }
}
