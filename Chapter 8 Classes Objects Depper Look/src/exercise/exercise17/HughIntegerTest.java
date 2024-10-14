package exercise.exercise17;

import java.util.Arrays;
import java.util.Scanner;

public class HughIntegerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        String number = input.nextLine();

        HughInteger arrayInteger1 = new HughInteger(number);

        System.out.println("Enter the number:");
        String number2 = input.nextLine();

        HughInteger arrayInteger2 = new HughInteger(number2);

        Integer[] sumIntegerArray = HughInteger.add(arrayInteger1.getArrayInteger(), arrayInteger2.getArrayInteger());

        System.out.println(Arrays.toString(sumIntegerArray));


    }
}
