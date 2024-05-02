package exercises.exercise17;

import java.util.Locale;
import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Health Profile:");
        System.out.println("Enter the name:");
        String name = input.nextLine();
        System.out.println("Enter the last name:");
        String lastName = input.nextLine();
        System.out.println("Enter the gender:");
        String gender = input.nextLine();
        System.out.println("Enter the month birth:");
        Integer month = input.nextInt();
        System.out.println("Enter the day birth:");
        Integer day = input.nextInt();
        System.out.println("Enter the year birth:");
        Integer year = input.nextInt();
        System.out.println("Enter the height:");
        double height = input.nextDouble();
        System.out.println("Enter the weight:");
        double weight = input.nextDouble();

        HealthProfile healthProfile = new HealthProfile(name, lastName, gender, month, day, year, height, weight);

        System.out.println("Name: " + healthProfile.toString());
    }
}
