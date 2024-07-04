package example;

import java.security.SecureRandom;

public class Example3RollDice {
    public static void main(String[] args) {
        // randomNumbers object will produce secure random numbers]
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        // tally counts for 60,000,000 rolls of a die
        for (int roll = 1; roll <= 60_000_000; roll++) {
            // O random number funciona assim
            // se estiver apenas randomNumbers.nextInt(6) ele ira sortear um numero de 0 a 6
            // se colocarmos um numero para somar ele ira sortear um numero exemplo 3 esse 3 ele soma com o 1
            // e se 1 mais o resultado da funcao randomNumber
            // isso impossibilita que de 0
            // E com isso podemos diversificar, ex: 3 * um numero aleatorio de uma a 6 tem o potencial de produzir
            // 0, 3, 6, 9 0 por que agora nao somamos com nada pra eliminar o 0
            // int number = 2 + 3 * randomNumbers.nextInt(5); entao isso tem o potencial de produzir
            // 2, 5, 8, 11 and 14.
            // int number = shiftingValue +
            //differenceBetweenValues * randomNumbers.nextInt(scalingFactor);
            int face = 1 + randomNumbers.nextInt(6); // number from 1 to 6
            // use face value 1-6 to determine which counter to increment
            switch (face) {

                case 1:
                    ++frequency1; // increment the 1s counter
                    break;

                case 2:
                    ++frequency2; // increment the 2s counter
                    break;

                case 3:
                    ++frequency3; // increment the 3s counter
                    break;

                case 4:
                    ++frequency4; // increment the 4s counter
                    break;

                case 5:
                    ++frequency5; // increment the 5s counter
                    break;

                case 6:
                    ++frequency6; // increment the 6s counter
                    break;
            }
        }

        System.out.println("Face\tFrequency"); // output headers
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);

    }
}


