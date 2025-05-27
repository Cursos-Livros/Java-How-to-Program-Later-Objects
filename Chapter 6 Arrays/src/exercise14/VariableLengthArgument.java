package exercise14;

import java.util.Scanner;

public class VariableLengthArgument {
    public static void main(String[] args) {
        // 1. Pass individual arguments (most common)
        average(10, 10, 10);
    }

    static void average(int... listInteger) {
        int sum = 0;
        int quantity = 0;

        for (int number : listInteger) {
            sum += number;
            quantity += 1;
        }

        double average = (double) sum / quantity;
        System.out.println(average);
    }
}
