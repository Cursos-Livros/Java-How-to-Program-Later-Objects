package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise10PixelQuantizationArrayListVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inicializando array com 0
        ArrayList<Integer> array = new ArrayList<Integer>(10);
        System.out.println("Enter with a number to quantization");
        addNumberToArray(array, input);
        System.out.println(pixelQuantization(array));
    }

    public static ArrayList<Integer> addNumberToArray(ArrayList<Integer> array, Scanner input) {
        for (int i = 0; i < 10; i++) {
            array.add(input.nextInt());
        }
        return array;
    }

    public static ArrayList<Integer> pixelQuantization(ArrayList<Integer> array) {
        ArrayList<Integer> quantizedArray = new ArrayList<Integer>(array);

        // for each nao funciona muito bem aqui pois e necessario mudar(set) o elemento no indice
        // nesse caso o set funciona melhor e utilizando um laco for normal
        for (int i = 0; i < array.size(); i++) {
            quantizedArray.set(i, calculateQuantization(i));
        }

        return quantizedArray;
    }

    public static Integer calculateQuantization(int value) {
        if (value <= 20) {
            return 10;
        }
        if (value > 20 && value <= 40) {
            return 30;
        }
        if (value > 40 && value <= 60) {
            return 50;
        }
        if (value > 60 && value <= 80) {
            return 70;
        }
        if (value > 80 && value <= 100) {
            return 90;
        }
        if (value > 100 && value <= 120) {
            return 120;
        }
        if (value > 120 && value <= 140) {
            return 130;
        }
        if (value > 140 && value <= 160) {
            return 150;
        }
        if (value > 161 && value <= 180) {
            return 170;
        }

        return 190;
    }
}

