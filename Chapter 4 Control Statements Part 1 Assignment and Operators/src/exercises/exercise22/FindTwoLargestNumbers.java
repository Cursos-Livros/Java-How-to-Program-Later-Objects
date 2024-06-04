package exercises.exercise22;

import java.util.Scanner;

public class FindTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the number of numbers to includding:");
        int numberIncludes = input.nextInt();

        int secondMaximumValue = 0;
        int maximumValue = 0;

        for (int i = 0; i < numberIncludes; i++) {
            System.out.println("Enter with the " + (i + 1) + " number:");
            int number = input.nextInt();

            // A estratégia aqui é fazer com que o maior valor e o segundo menor valor recebam promeiramente o mesmo valor
            // caso o numero que vier seja maior que o valor o maior valor recebe ele e o segundo maior valor recebe o maior valor
            // Ja que o mesmo era o maior valor anteriormente
            // Depois é necessário testar se o numero é maior que segundo maior valor mas menor que o maior valor
            // exe:
            // 3 2 1
            if (number > maximumValue) {
                secondMaximumValue = maximumValue;
                maximumValue = number;
            } else if (number > secondMaximumValue && number < maximumValue) {
                secondMaximumValue = number;
            }
        }

        System.out.println("The largest number of solds is: " + secondMaximumValue + " " + maximumValue);
    }
}
