package exercise14;

import java.util.Scanner;

public class VariableLengthArgument {
    public static void main(String[] args) {
        // Varargs Variable Arguments
        // Um tipo de assinatura de método que pode receber qualquer numero de inputs
        // Permite criar usar o mesmo método para diferentes numeros de parametros
        // Pode receber valor nenhum

        average(10, 10, 10);
    }

    static void average(int... listInteger) {
        int sum = 0;
        int quantity = 0;

        for (int number : listInteger) {
            sum += number;
            quantity += 1;
        }

        double average = (double) sum / listInteger.length;
        System.out.println(average);
    }
}
