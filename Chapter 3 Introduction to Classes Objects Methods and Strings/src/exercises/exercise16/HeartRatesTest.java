package exercises.exercise16;

import java.util.Locale;
import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Target-Heart-Rate Calculator");
        System.out.println("Enter with your name:");
        String name = input.nextLine();
        System.out.println("Enter with your last name:");
        String lastName = input.nextLine();

        System.out.println("Enter the month birth:");
        int month = input.nextInt();
        System.out.println("Enter with day birth:");
        int day = input.nextInt();
        System.out.println("Enter the year birth:");
        int year = input.nextInt();
        System.out.println("Enter the current year:");
        int currentYear = input.nextInt();

        HeartRates heartRates = new HeartRates(name, lastName, month, day, year);

        System.out.println("Person age: " + heartRates.personAge(currentYear));
        System.out.println("Maximum Heart Rate: " + heartRates.maximumHeartRate(currentYear));
        System.out.println("Target Heart Rate Minimum: " + heartRates.targetMinimumHeartRate(currentYear));
        System.out.println("Target Heart Rate Maximum: " + heartRates.targetMaximumHeartRate(currentYear));
    }
}
