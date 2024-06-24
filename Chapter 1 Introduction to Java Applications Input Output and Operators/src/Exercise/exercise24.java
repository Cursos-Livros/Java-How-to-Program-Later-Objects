package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer 1:");
        int integer1 = scanner.nextInt();
        System.out.println("Enter the integer 2:");
        int integer2 = scanner.nextInt();
        System.out.println("Enter the integer 3:");
        int integer3 = scanner.nextInt();
        System.out.println("Enter the integer 4:");
        int integer4 = scanner.nextInt();
        System.out.println("Enter the integer 5:");
        int integer5 = scanner.nextInt();

        int smallest;
        int larger;

        if (integer1 < integer2 && integer1 < integer3 && integer1 < integer4 && integer1 < integer5) {
            smallest = integer1;
        } else if (integer2 < integer3 && integer2 < integer4 && integer2 < integer5) {
            smallest = integer2;
        } else if (integer3 < integer4 && integer3 < integer5) {
            smallest = integer3;
        } else if (integer4 < integer5) {
            smallest = integer4;
        } else {
            smallest = integer5;
        }

        if (integer1 > integer2 && integer1 > integer3 && integer1 > integer4 && integer1 > integer5) {
            larger = integer1;
        } else if (integer2 > integer3 && integer2 > integer4 && integer2 > integer5) {
            larger = integer2;
        } else if (integer3 > integer4 && integer3 > integer5) {
            larger = integer3;
        } else if (integer4 > integer5) {
            larger = integer4;
        } else {
            larger = integer5;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Larger: " + larger);
    }
}
