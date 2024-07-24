package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise10PixelQuantization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inicializando array com 0
        Integer[] array = new Integer[10];
        System.out.println("Enter with a number to quantization");
        addNumberToArray(array, input);
        System.out.println(Arrays.toString(pixelQuantization(array)));
    }

    public static Integer[] addNumberToArray(Integer[] array, Scanner input) {
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static Integer[] pixelQuantization(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 20) {
                array[i] = 10;
            }
            if (array[i] > 20 && array[i] <= 40) {
                array[i] = 30;
            }
            if (array[i] > 40 && array[i] <= 60) {
                array[i] = 50;
            }
            if (array[i] > 60 && array[i] <= 80) {
                array[i] = 70;
            }
            if (array[i] > 80 && array[i] <= 100) {
                array[i] = 90;
            }
            if (array[i] > 100 && array[i] <= 120) {
                array[i] = 110;
            }
            if (array[i] > 120 && array[i] <= 140) {
                array[i] = 130;
            }
            if (array[i] > 140 && array[i] <= 160) {
                array[i] = 150;
            }
            if (array[i] > 161 && array[i] <= 180) {
                array[i] = 170;
            }
            if (array[i] > 181) {
                array[i] = 190;
            }
        }
        return array;
    }
}
