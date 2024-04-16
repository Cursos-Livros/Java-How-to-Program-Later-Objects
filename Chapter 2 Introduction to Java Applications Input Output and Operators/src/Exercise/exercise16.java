package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer 1:");
        int integer1 = scanner.nextInt();
        System.out.println("Enter the integer 2:");
        int integer2 = scanner.nextInt();

        if(integer1 > integer2){
            System.out.println("Integer 1 is larger!");
        } else if (integer2 > integer1) {
            System.out.println("Integer 2 is larger!");
        } else {
            System.out.println("Numbers is equal!");
        }
    }
}
