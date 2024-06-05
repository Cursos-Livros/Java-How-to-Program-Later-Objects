package exercises.Exercise29;

import java.util.Locale;
import java.util.Scanner;

public class SquareAsterisks {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the size of the square:");
        int numberSize = input.nextInt();

        char asterisk = '*';

        for (int i = 0; i < numberSize; i++) {
            for (int j = 0; j < numberSize; j++) {
                //Controls the line
                if (i == 0 || i == (numberSize - 1)) {
                    System.out.print(asterisk);
                } else if (j == 0 || j == (numberSize - 1)) {
                    System.out.print(asterisk);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
