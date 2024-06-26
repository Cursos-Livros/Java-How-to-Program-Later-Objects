package exercise.exercise15;

import java.util.Arrays;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        char asterisk = '*';
        int size = 0;

        System.out.println("a)");
        for (int height = 0; height < 10; height++) {
            for (int width = 0; width < height; width++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("b)");
        for (int height = 10; height > 0; height--) {
            for (int width = height; width > 0; width--) {
                System.out.print(asterisk);
            }
            System.out.println();
        }

        int blankSpace = 0;
        System.out.println("c)");
        for (int height = 10; height > 0; height--) {
            // Funciona assim:
            // Este loop leva de 0 ate 10 - altura
            // Exemplo: i = 10, i é menor que 10 - altura ou seja 10 - 10 = 0 entao nao printa nenhum asterisco
            // i = 9, i é menor que 10 - 9 = 1, sim entao printa 1 vez
            // e assim por diante
            for (int i = 0; i < 10 - height; i++) {
                System.out.print(" ");
            }
            // Print asterisks with spaces in between
            for (int width = height; width > 0; width--) {
                System.out.print(asterisk);
            }
            System.out.println();
        }


        System.out.println("d)");
        for (int height = 0; height < 10; height++) {
            // Funciona assim:
            // Este loop leva de 0 ate 10 - altura
            // Exemplo: i = 10, i é menor que 10 - altura ou seja 10 - 10 = 0 entao nao printa nenhum asterisco
            // i = 9, i é menor que 10 - 9 = 1, sim entao printa 1 vez
            // e assim por diante
            for (int i = 10 - height; i > 1; i--) {
                System.out.print(" ");
            }
            // Print asterisks with spaces in between
            for (int width = 0; width < height; width++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }

}
