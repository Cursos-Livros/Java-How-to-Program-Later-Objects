package exercise.exercise7enhancingclassdate;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month:");
        int month = input.nextInt();
        System.out.println("Enter the day:");
        int day = input.nextInt();
        System.out.println("Enter the year");
        int year = input.nextInt();

        Date date = new Date(month, day, year);

        System.out.println("How many days pass?");
        int dayPass = input.nextInt();

        System.out.println("How many month pass?");
        int monthPass = input.nextInt();

        System.out.println("How many years pass?");
        int yearPass = input.nextInt();

        date.incrementDay(dayPass);
        date.incrementMonth(monthPass);
        date.incrementYear(yearPass);
    }
}
