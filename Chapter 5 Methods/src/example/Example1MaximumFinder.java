package example;

import java.util.Scanner;

public class Example1MaximumFinder {
    // Classe Estatica
    // Classe que possui apenas metodos
    // Classe main estatica para nao ter que instanciar um objeto
    // Quando um programa é executado a JVM procura pela funcao static main
    // E a funcao main recebe as strings necessarias para sua aplicacao rodar
    // Quando usamos o objeto Scanner passamos os valores das funcoes do scanner ex nextLine(String), como argumento da main
    //

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for and input three floating-point values
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble(); // read first double
        double number2 = input.nextDouble(); // read second double
        double number3 = input.nextDouble(); // read third double

        // determine the maximum value
        double result = maximum(number1, number2, number3);

        // display maximum value
        System.out.println("Maximum is" + result);
    }

    // returns the maximum of its three double parameters
    // funcoes estaticas podem chamar outras funcoes estaticas diretamente de outra forma
    // teria que chamar atraves do nome da classe
    // ex: Math.sqrt()
    public static double maximum(double x, double y, double z){
        double maximumValue = x; // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if (y > maximumValue) {
            maximumValue = y;
        }

        // determine whether z is greater than maximumValue
        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;
    }
}