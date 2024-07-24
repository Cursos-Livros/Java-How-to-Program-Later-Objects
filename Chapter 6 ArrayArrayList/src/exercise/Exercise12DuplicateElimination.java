package exercise;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise12DuplicateElimination {
    public final static Integer SIZE = 10;

    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        Integer[] array1 = new Integer[SIZE];
        ArrayList<Integer> array2 = new ArrayList<Integer>(SIZE);

        setElementsArrayLess1(array1, randomNumber);
        setElementsArrayListLess1(array2, randomNumber);

        setRandomElements(array1, randomNumber);
        setRandomElementsArrayList(array2, randomNumber);

        sortArray1(array1);

        removingDuplicates(array1);

        System.out.println(Arrays.toString(array1));
        System.out.println(array2);
    }

    public static Integer[] setElementsArrayLess1(Integer[] array1, SecureRandom randomNumber) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = -1;
        }

        return array1;
    }

    public static ArrayList<Integer> setElementsArrayListLess1(ArrayList<Integer> array2, SecureRandom randomNumber) {
        // Deve se usar o size e nao o array size, por que o array ainda nao esta preenchido
        for (int i = 0; i < SIZE; i++) {
            // Nao se deve usar set pois set substitui valores que ja existem
            array2.add(i, less1());
        }
        return array2;
    }

    public static Integer less1() {
        return -1;
    }

    public static Integer[] setRandomElements(Integer[] array1, SecureRandom randomNumber) {

        for (int i = 0; i < array1.length; i++) {
            Integer number = 1 + randomNumber.nextInt(10);
            array1[i] = number;
        }
        return array1;
    }

    public static ArrayList<Integer> setRandomElementsArrayList(ArrayList<Integer> array2, SecureRandom randomNumber) {
        for (int i = 0; i < SIZE; i++) {
            Integer number = 1 + randomNumber.nextInt(10);
            array2.set(i, number);
        }

        return array2;
    }

    public static Integer[] sortArray1(Integer[] array1) {
        Arrays.sort(array1);
        return array1;
    }

    public static Integer[] removingDuplicates(Integer[] array1) {
        int size = array1.length;

        Integer[] temporaryArray = new Integer[size];
        int j = 0;

        for (int i = 0; i < size - 1; i++) {
            if (array1[i] != array1[i + 1]) {
                temporaryArray[j++] = array1[i];
            }
        }

        temporaryArray[j++] = array1[size - 1];

        for (int i = 0; i < j; i++) {
            array1[i] = temporaryArray[i];
        }
        return array1;
    }
}
