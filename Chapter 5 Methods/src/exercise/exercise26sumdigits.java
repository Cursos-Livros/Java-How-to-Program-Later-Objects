package exercise;

import java.util.Scanner;

public class exercise26sumdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int number) {
        int temporary = 0;

        while (number > 0) {
            int digit = number % 10; // Remove um digito  técnica do resto, o resto é do primeiro operando dividido
            // pelo segundo
            temporary += digit;// Adiciona mais uma ordem a qualquer numero que vier,
            // exemplo (numero 121): (0 * 10) + 1 = 1 / (1*10) = 10 + 2 = 12 / (12 * 10) = 120 + 1 = 121
            number = number / 10;
        }

        return temporary;
    }
}
