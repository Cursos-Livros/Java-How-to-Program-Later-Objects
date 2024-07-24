package exercise;

import java.util.Scanner;

public class exercise16Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char option = 't';
        while (option == 't') {
            System.out.println("Enter number 1:");
            int number1 = input.nextInt();
            System.out.println("Enter number 2:");
            int number2 = input.nextInt();

            boolean isMultiple = multipleTest(number1, number2);

            System.out.println("O numero " + number1 + " " + isMultipleOutput(isMultiple) + " de " + number2 + "!");

            System.out.println("Deseja continuar: digite t para sim e f para nao");
            option = optionChoice(input);
        }
    }

    public static boolean multipleTest(int number1, int number2) {
        return (number1 % number2) != 1;
    }

    public static String isMultipleOutput(boolean isMultiple) {
        if (isMultiple) {
            return "e multiplo";
        }
        return "nao e multiplo";
    }

    public static char optionChoice(Scanner input){
       char option = input.next().charAt(0);
       if(option != 't' && option != 'f'){
           option =  optionError(input, option );
       }
       return option;
    }

    public static char optionError(Scanner input, char option ){
        char optionTest = option;
        while(optionTest != 't' && optionTest != 'f'){
            System.out.println("Opcao invalida digite t ou n");
            optionTest = input.next().charAt(0);
        }

        return optionTest;
    }
}
