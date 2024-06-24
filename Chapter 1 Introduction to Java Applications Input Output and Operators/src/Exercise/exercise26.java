package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer 1:");
        int integer1 = scanner.nextInt();

        System.out.println("Enter the integer 2:");
        int integer2 = scanner.nextInt();

        if (integer1 % integer2 == 1) {
            System.out.println("The first number isn't multiple of the second number");
        } else {
            System.out.println("The first number is multiple of the second number");
        }
    }
}
