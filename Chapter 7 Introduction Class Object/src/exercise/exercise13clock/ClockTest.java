package exercise.exercise13clock;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the hour value");
        int hour = input.nextInt();
        System.out.println("Enter the minutes value");
        int minutes = input.nextInt();
        System.out.println("Enter the seconds value");
        int seconds = input.nextInt();

        Clock clock = new Clock(hour, minutes, seconds);

        clock.displayTime();
    }
}
