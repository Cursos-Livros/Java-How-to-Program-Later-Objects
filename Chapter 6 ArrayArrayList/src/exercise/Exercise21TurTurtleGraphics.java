package exercise;

import java.util.Arrays;

public class Exercise21TurTurtleGraphics {
    public static void main(String[] args) {
        // Define an array of decimal numbers
        double[] numbers = {2.5, 6.7, 4.1, 9.8, 3.3};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Iterate through each element of the array and round it down using Math.floor()
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.floor(numbers[i]);
        }

        // Print the modified array with floored values
        System.out.println("Floored array: " + Arrays.toString(numbers));
    }
}
