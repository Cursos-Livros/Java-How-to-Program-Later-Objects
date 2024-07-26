package exercise;

import java.util.Scanner;

public class Exercise16UsingEnhancedStatement {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int sizeArray = input.nextInt();

        Integer[] arrayNumber = fillList(sizeArray, input);

        showArray(arrayNumber);
    }

    public static Integer[] fillList(int size, Scanner input) {
        Integer[] listCalculate = new Integer[size];

        for (int i = 0; i < listCalculate.length; i++) {
            listCalculate[i] = input.nextInt();
        }

        return listCalculate;
    }

    public static void showArray(Integer[] array) {
        int i = 0;
        for(int values: array){
            i++;
            System.out.println("Item " + i + ": " + values);
        }
    }

}
