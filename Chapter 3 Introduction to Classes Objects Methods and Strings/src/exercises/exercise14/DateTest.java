package exercises.exercise14;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month number:");
        int month = input.nextInt();

        System.out.println("Enter the day number:");
        int day = input.nextInt();

        System.out.println("Enter the year number");
        int year = input.nextInt();

        Date1 date1 = new Date1(month, day, year);

        System.out.println(date1.displayDate());
    }
}
