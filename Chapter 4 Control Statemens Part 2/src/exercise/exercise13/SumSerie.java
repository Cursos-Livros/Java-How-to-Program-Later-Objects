package exercise.exercise13;

import java.util.Scanner;

public class SumSerie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of serie:");
        int serieLength = input.nextInt();

        long sum = 0;

        for (int i = 0; i <= serieLength; i++) {
            sum += i;
        }

        System.out.println("Total sum of the serie: " + sum);
    }
}
