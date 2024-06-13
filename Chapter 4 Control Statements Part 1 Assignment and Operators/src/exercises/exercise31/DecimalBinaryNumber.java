package exercises.exercise31;

import java.util.Scanner;

public class DecimalBinaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the binary number:");
        int binaryNumber = input.nextInt();

        int decimalNumber = 0;
        int position = 0;

        while (binaryNumber != 0) {
            // Retira o digito do numero
            int digit = binaryNumber % 10;
            System.out.println(digit);

            // Recebe o digito * quadrado da posicao
            // Exemplo 1 * (2 ^0) = 1
            decimalNumber += (int) (digit * Math.pow(2, position));
            // Remove o ultimo digito
            binaryNumber /= 10;
            // Aumenta 1 posicao
            position++;
        }

        System.out.println("Decimal equivalent: " + decimalNumber);
    }
}
