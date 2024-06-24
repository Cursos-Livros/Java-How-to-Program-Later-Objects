package exercises.exercise39;

import java.util.Locale;
import java.util.Scanner;

public class PrivacyCryptography {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1000 and 9999. If the number is not in this interval, the program will generate an error.");
        int number = input.nextInt();

        while (number < 1000 || number > 9999) {
            System.out.println("Error, number is out of the valid interval.");
            System.out.println("Enter another number:");
            number = input.nextInt();
        }

        int encryptedNumber = encrypt(number);
        System.out.println("Encrypted number: " + String.format("%04d", encryptedNumber));

        int decryptedNumber = decrypt(encryptedNumber);
        System.out.println("Decrypted number: " + String.format("%04d", decryptedNumber));

        input.close();
    }

    public static int encrypt(int number) {
        // Extrair cada dígito
        int thousands = (number / 1000) % 10;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = number % 10;

        // Adicionar 7 e tomar o resto da divisão por 10
        thousands = (thousands + 7) % 10;
        hundreds = (hundreds + 7) % 10;
        tens = (tens + 7) % 10;
        units = (units + 7) % 10;

        // Trocar o primeiro dígito com o terceiro e o segundo com o quarto
        int encrypted = (tens * 1000) + (units * 100) + (thousands * 10) + hundreds;

        return encrypted;
    }

    public static int decrypt(int number) {
        // Extrair cada dígito
        int thousands = (number / 1000) % 10;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = number % 10;

        // Trocar os dígitos de volta
        int swapped = (thousands * 10) + (hundreds) + (tens * 1000) + (units * 100);

        // Reverter a adição de 7
        int decryptedThousands = (swapped / 1000) % 10;
        int decryptedHundreds = (swapped / 100) % 10;
        int decryptedTens = (swapped / 10) % 10;
        int decryptedUnits = swapped % 10;

        decryptedThousands = (decryptedThousands + 10 - 7) % 10;
        decryptedHundreds = (decryptedHundreds + 10 - 7) % 10;
        decryptedTens = (decryptedTens + 10 - 7) % 10;
        decryptedUnits = (decryptedUnits + 10 - 7) % 10;

        int decrypted = (decryptedThousands * 1000) + (decryptedHundreds * 100) + (decryptedTens * 10) + decryptedUnits;

        return decrypted;
    }
}
