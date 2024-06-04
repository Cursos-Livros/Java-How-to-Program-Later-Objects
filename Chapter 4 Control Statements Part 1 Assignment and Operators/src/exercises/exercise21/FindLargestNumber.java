package exercises.exercise21;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Sales Contest!");
        System.out.println("Enter with the number of sales:");
        int numberSales = input.nextInt();

        int maximumValue = 0;

        for (int i = 0; i < numberSales; i++) {
            System.out.println("Enter with the " + (i+1) + " number of sale:");
            int numberUnitsSold = input.nextInt();

            if(numberUnitsSold > maximumValue){
                maximumValue = numberUnitsSold;
            }
        }

        System.out.println("The largest number of solds is: " + maximumValue);
    }
}
