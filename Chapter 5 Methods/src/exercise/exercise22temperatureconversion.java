package exercise;

import java.util.Scanner;

public class exercise22temperatureconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What type of conversion temperature you new?");
        System.out.println("Enter 1 to Celsius -> Kelvin");
        System.out.println("Enter 2 to Celsius -> Kelvin");

        int conversionOption = choiceConvertionOption(input);

        System.out.println("Enter the temperature in Celsius");
        double temperature = input.nextInt();

        double result = 0;
        if (conversionOption == 1) {
            result = celsiusToKelvin(temperature);
            System.out.println("Temperature: " +  temperature + "Celsius = " + result + " Kelvins");
        } else {
            result = KelvinToCelsius(temperature);
            System.out.println("Temperature: " +  temperature + "Kelvins = " + result + " Celsius");
        }


    }

    public static int choiceConvertionOption(Scanner input) {
        int option = input.nextInt();

        return optionError(input, option);
    }

    public static int optionError(Scanner input, int option) {
        int optionTest = option;

        while (optionTest != 1 && optionTest != 2) {
            System.out.println("this option dont exist enter 1 or 2!");
            System.out.println("Enter the number again:");
            optionTest = input.nextInt();
        }

        return optionTest;
    }

    public static double celsiusToKelvin(double temperature) {
        return temperature + 273.15;
    }

    public static double KelvinToCelsius(double temperature) {
        return temperature - 273.15;

    }
}
