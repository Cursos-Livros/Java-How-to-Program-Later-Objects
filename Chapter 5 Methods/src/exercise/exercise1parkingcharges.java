package exercise;

import java.util.Scanner;

public class exercise1parkingcharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the number of hours the client stay:");
        int numberHoursClient = NumberHoursClientInput(input);

        double total = calculateCharges(numberHoursClient);

        System.out.printf("The total value is: R$ %.2f",  total);

        input.close();
    }

    public static int NumberHoursClientInput(Scanner input) {
        input = new Scanner(System.in);
        int numberHour = input.nextInt();

        return numberHourLess0Test(input, numberHour);
    }

    public static int numberHourLess0Test(Scanner input, int numberHour) {
        int numberHourTest = numberHour;

        if (numberHour < 0) {
            numberHourTest = numberHourError(input, numberHourTest);
        }

        return numberHourTest;
    }

    public static int numberHourError(Scanner input, int numberHourTest) {
        input = new Scanner(System.in);

        System.out.println("The number of hours cannot be less than 0!");
        System.out.println("Enter again!");
        int numberHourErrorTest = input.nextInt();

        while (numberHourErrorTest < 0) {
            System.out.println("The number of hours cannot be less than 0!");
            System.out.println("Enter again!");
            numberHourErrorTest = input.nextInt();
        }

        return numberHourErrorTest;
    }

    public static double calculateCharges(int numberHours) {
        double value = 0.0;

        if (numberHours <= 3) {
           return value = 2.00;
        }

        return value = (((double) numberHours -3) * 0.5) + 2.00;
    }
}
