package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class exercise25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer 1:");
        int integer1 = scanner.nextInt();

        if (integer1 % 2 == 0) {
            System.out.println("Is odd!");
        }else {
            System.out.println("Is   even!");
        }


    }
}
