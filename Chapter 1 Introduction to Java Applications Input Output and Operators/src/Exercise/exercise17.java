package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer 1:");
        int integer1 = scanner.nextInt();
        System.out.println("Enter the integer 2:");
        int integer2 = scanner.nextInt();
        System.out.println("Enter the integer 3:");
        int integer3 = scanner.nextInt();

        int sum = integer1 + integer2 + integer3;
        double media = (integer1 + integer2 + integer3) / 3;
        int product = integer1 * integer2 * integer3;
        int smallest;

        if (integer1 < integer2 && integer1 < integer3) {
            smallest = integer1;
        } else if (integer2 < integer3) {
            smallest = integer2;
        } else {
            smallest = integer3;
        }

        System.out.println("Sum:" + sum);
        System.out.println("Media: " + media);
        System.out.println("Product: " + product);

        System.out.println("Smallest number: " + smallest);

        int larger;

        if (integer1 > integer2 && integer1 > integer3) {
            larger = integer1;
        } else if (integer2 > integer3) {
            larger = integer2;
        } else {
            larger = integer3;
        }
        System.out.println("Largest number number: " + larger);
    }
}
