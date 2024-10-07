package exercise.exercise15;

import java.util.Scanner;

public class FancyTimeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the hour:");
        int hour = input.nextInt();
        System.out.println("enter the minute:");
        int minute = input.nextInt();
        System.out.println("Enter the second");
        int second = input.nextInt();

        input.nextLine();

        System.out.println("Enter the meridiem: (AM or PM)");
        String meridiem = input.nextLine();

        FancyTime time = new FancyTime(hour, minute, second, meridiem);

        System.out.println("What type you need display the hours:");
        System.out.println("1 - HH:MM:SS a.m. / p.m. (12 hour format)");
        System.out.println("2 - HH:MM:SS (24 hour format)");
        System.out.println("3 - HH:MM (24 hour format)");
        int hourDisplayOption = input.nextInt();

        System.out.printf(time.displayTime(hourDisplayOption));
    }
}
