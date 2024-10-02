package exercise.exercise14;

import java.util.Scanner;

public class SetIntegerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What the size of the list 1:");
        System.out.println("Enter number between 1 and 10");
        int sizeList = sizeListResult(input);

        System.out.println("Enter the integer");
        int integer = integerRangeTest(input, sizeList);
        SetInteger integerSet = new SetInteger(integer - 1, sizeList);
        setManipulation(integerSet, input, sizeList);

        System.out.println("What the size of the list 2:");
        System.out.println("Enter number between 1 and 10");
        int sizeList2 = sizeListResult(input);

        System.out.println("Enter the integer");
        int integer2 = integerRangeTest(input, sizeList);
        SetInteger integerSet2 = new SetInteger(integer2 - 1, sizeList2);
        setManipulation(integerSet2, input, sizeList2);

        System.out.println(SetInteger.showUnion(SetInteger.union(integerSet.getA(), integerSet2.getA())));

        input.close();
    }

    public static Integer sizeListResult(Scanner input) {
        int sizeList = input.nextInt();
        while (!testSize(sizeList)) {
            int sizeListError = sizeList;
            sizeList = fixTestSize(sizeListError, input);
        }
        return sizeList;
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
        } while (!testSize(newSizeOption));
        return newSizeOption;
    }

    public static Integer integerRangeTest(Scanner input, int sizeList) {
        int integer = input.nextInt();
        while (!integerRange(integer, sizeList)) {
            int integerOutRange = integer;
            integer = fixRangeInteger(integerOutRange, input, sizeList);
        }
        return integer;
    }

    public static Boolean integerRange(int integerToTest, int sizeList) {
        return integerToTest > 0 && integerToTest <= sizeList;
    }

    public static Integer fixRangeInteger(int integerOutRange, Scanner input, int sizeList) {
        int newInteger = integerOutRange;
        do {
            System.out.println("This number " + newInteger + " it's not permmited");
            System.out.println("Enter a new number:");
            newInteger = input.nextInt();
        } while (!integerRange(newInteger, sizeList));
        return newInteger;
    }

    public static void setManipulation(SetInteger setList, Scanner input, int sizeList) {
        char option = ' ';
        while (option != 'q') {
            System.out.println("Enter the new integer");
            int integer = integerRangeTest(input, sizeList);

            setList.setInteger(integer - 1);
            System.out.println(setList.showSetInteger());

            System.out.println("Want to stop");
            option = input.next().charAt(0);
        }
    }
}
