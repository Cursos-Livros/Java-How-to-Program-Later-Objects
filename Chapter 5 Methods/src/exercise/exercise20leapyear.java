package exercise;

import java.util.Scanner;

public class exercise20leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter at the year:");
        int year = input.nextInt();

        System.out.println("The year " + year + " is leap: " + isLeapYear(year));


    }

    public static boolean isLeapYear(int year) {
        int yearToKnow = year;
        int twoLastDigits = lastDigitsSeparator(yearToKnow);

        return (twoLastDigits % 4) == 0;
    }

    public static int lastDigitsSeparator(int yearToKnow) {
        int yearToSeparate = yearToKnow;

        return yearToSeparate % 100;
    }
}
