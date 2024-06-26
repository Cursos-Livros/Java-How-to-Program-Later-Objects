package exercise.exercise16;

import java.util.Scanner;

public class BraCharPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char asterisk = '*';
        int numberIncludes1 = 0;
        int numberIncludes2 = 0;
        int numberIncludes3 = 0;
        int numberIncludes4 = 0;
        int numberIncludes5 = 0;

        System.out.println("Enter with the number of numbers of bar:");

        numberIncludes1 = input.nextInt();
        numberIncludes2 = input.nextInt();
        numberIncludes3 = input.nextInt();
        numberIncludes4 = input.nextInt();
        numberIncludes5 = input.nextInt();


        for (int line = 0; line < numberIncludes1; line++) {
            System.out.print(asterisk);
        }
        System.out.println();


        for (int line = 0; line < numberIncludes2; line++) {
            System.out.print(asterisk);
        }
        System.out.println();


        for (int line = 0; line < numberIncludes3; line++) {
            System.out.print(asterisk);
        }
        System.out.println();


        for (int line = 0; line < numberIncludes4; line++) {
            System.out.print(asterisk);
        }
        System.out.println();


        for (int line = 0; line < numberIncludes5; line++) {
            System.out.print(asterisk);
        }
        System.out.println();
    }
}
