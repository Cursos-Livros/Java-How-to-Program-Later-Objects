package exercise.exercise17;

import java.math.BigInteger;
import java.util.Arrays;

public class HughInteger {
    private Integer[] arrayInteger;

    public HughInteger(String number) {
        arrayInteger = new Integer[10];
        fillArray0();
        parse(number);
    }

    public Integer[] getArrayInteger() {
        return arrayInteger;
    }

    private void fillArray0() {
        for (int i = 0; i < arrayInteger.length; i++) {
            if(arrayInteger[i] == null){
                arrayInteger[i] = 0;
            }
        }
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
            newArrayInteger[i] = otherArrayInteger1[i] + otherArrayInteger2[i];
        }
        return newArrayInteger;
    }

    public static Integer[] sub(Integer[] otherArrayInteger1, Integer[] otherArrayInteger2) {
        int sizeBiggerArray = Math.max(otherArrayInteger1.length, otherArrayInteger2.length);
        Integer[] newArrayInteger = new Integer[sizeBiggerArray];

        for (int i = 0; i < newArrayInteger.length; i++) {
            newArrayInteger[i] = otherArrayInteger1[i] - otherArrayInteger2[i];
        }
        return newArrayInteger;
    }

    public static Boolean isEqualTo(Integer[] otherArrayInteger1, Integer[] otherArrayInteger2) {
        return Arrays.equals(otherArrayInteger1, otherArrayInteger2);
    }

    public static String isGreaterThan(Integer[] otherArrayInteger1, Integer[] otherArrayInteger2) {
        if (otherArrayInteger1.length > otherArrayInteger2.length) {
            return "Array 1 is the Bigger";
        }
        if (otherArrayInteger2.length > otherArrayInteger1.length) {
            return "Array 2 is the Bigger";
        }

        for (int i = 0; i < otherArrayInteger1.length; i++) {
            if (otherArrayInteger1[i] > otherArrayInteger2[i]) {
                return "Array 1 is the Bigger";
            } else if (otherArrayInteger1[i] < otherArrayInteger2[i]) {
                return "Array 2 is the Bigger";
            }
        }

        return "Both arrays are equal";
    }


    @Override
    public String toString() {
        return Arrays.toString(arrayInteger);
    }
}
