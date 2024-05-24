package exercises.exercise19;

import java.util.Locale;
import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the salesperson id:");
        int salespersonId = input.nextInt();

        int countItems = 1;
        double totalItems = 0;

        while (true) {
            System.out.println("Enter with the item " + (countItems + 1) + "price: (enter with -1 to quit)");
            double itemValue = input.nextDouble();

            if (itemValue == -1) {
                break;
            }

            totalItems += itemValue;
        }

        SalesCommission salesCommission = new SalesCommission(salespersonId, totalItems);


    }
}
