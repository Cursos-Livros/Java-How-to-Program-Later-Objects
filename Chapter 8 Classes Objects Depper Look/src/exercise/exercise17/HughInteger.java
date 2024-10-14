package exercise.exercise17;

import java.math.BigInteger;
import java.util.Arrays;

public class HughInteger {
    private Integer[] arrayInteger = new Integer[10];

    public HughInteger(String number) {
        if (number.length() <= 0 || number.length() >= arrayInteger.length) {
            throw new IllegalArgumentException("This number size is not permmited!");
        }

        parse(number);
    }

    public Integer[] getArrayInteger() {
        return arrayInteger;
    }

    private void parse(String number) {
        for (int i = 0; i < number.length(); i++) {
            arrayInteger[i] = number.charAt(i) - '0'; // Manipulation of ascii table this equal number - 48 that's equal a the integer number 53 - 48 = 5;
        }
    }

    public static Integer[] add(Integer[] otherArrayInteger1, Integer[] otherArrayInteger2) {
        int sizeBiggerArray = Math.max(otherArrayInteger1.length, otherArrayInteger2.length);
        Integer[] newArrayInteger = new Integer[sizeBiggerArray];

        for (int i = 0; i < newArrayInteger.length; i++) {
            if (otherArrayInteger1[i] == null) {
                newArrayInteger[i] = 0;
                otherArrayInteger1[i] = 0;
                otherArrayInteger2[i] = 0;
            }
            newArrayInteger[i] = otherArrayInteger1[i] + otherArrayInteger2[i];
        }
        return newArrayInteger;
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayInteger);
    }
}
