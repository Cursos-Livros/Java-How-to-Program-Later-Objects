package exercises.exercise38;

import java.util.Locale;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the non negative number:");
        int number = input.nextInt();

        while (number < 0) {
            System.out.println("Enter the non negative number again:");
            number = input.nextInt();
        }

        int fatorial = 1;
        for (int i = number; i > 0; i--) {
            fatorial *= i;
        }


        double constantE = 1;

        for (int i = 1; i <= number; i++) {
            // Reinicializa o fatorial a cada iteracao para ficar
            long fatorialb = 1;
            // Calcula o fatorial
            for (int j = 1; j <= i; j++) {
                fatorialb *= j;
            }
            constantE +=  (1.0 / fatorialb);
        }

        System.out.println("Enter the non negative number:");
        int x = input.nextInt();

        double constantEPow = 1;

        for (int i = 1; i <= number; i++) {
            // Reinicializa o fatorial a cada iteracao para ficar
            long fatorialb = 1;
            // Calcula o fatorial
            for (int j = 1; j <= i; j++) {
                fatorialb *= j;
            }
            constantEPow +=  (Math.pow(x, i) / fatorialb);
        }

        System.out.println(fatorial);
        System.out.println(constantE);
        System.out.println(constantEPow);
    }
}
