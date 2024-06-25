package exercise.exercise12;

import java.util.Scanner;

public class IntegerDivisible3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        // 3,6,9
        for (int i = 0; i < 30; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("Total: " +  sum);

    }
}
