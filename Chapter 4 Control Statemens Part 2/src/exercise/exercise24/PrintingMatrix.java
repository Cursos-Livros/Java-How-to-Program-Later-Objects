package exercise.exercise24;

import java.util.Arrays;

public class PrintingMatrix {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int row = 1; row <= 5; row++) {
                System.out.print(line + " ");
            }
            System.out.println();
        }
    }
}
