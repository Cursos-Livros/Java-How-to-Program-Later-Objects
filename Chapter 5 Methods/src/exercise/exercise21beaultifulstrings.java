package exercise;

import java.util.Locale;
import java.util.Scanner;

public class exercise21beaultifulstrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter at the string:");
        String string = checkString(input);

        System.out.println("String: " + string);

        input.close();
    }

    public static String checkString(Scanner input) {
        String string = input.nextLine();

        if (!string.endsWith(".")) {
            string = checkFullStop(input, string);
        }

        if (stringFirstLetterCapitalized(string)) {
            string  = capitalizeString(string);
        }
        return string;
    }

    public static String checkFullStop(Scanner input, String string) {
        return string + '.';
    }

    public static Boolean stringFirstLetterCapitalized(String string) {
        String stringToCapitalize = string.trim();

        // Checa se a palavra nao e vazia
        // E se o caracter da posicao 0 é letra minuscula
        // Tem que se usar o character por que isLowerCase nao é um metodo estatico
        if (!(!stringToCapitalize.isEmpty() && Character.isLowerCase(string.charAt(0)))) {
            return false;
        }
        return true;
    }

    public static String capitalizeString(String string) {
        String stringToCapitalize = string.trim();
        return Character.toUpperCase(stringToCapitalize.charAt(0)) + stringToCapitalize.substring(1);
    }
}

