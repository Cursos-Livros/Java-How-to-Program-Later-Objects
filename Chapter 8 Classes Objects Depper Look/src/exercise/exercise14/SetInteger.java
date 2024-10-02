package exercise.exercise14;

import java.util.Arrays;

public class SetInteger {
    private Boolean[] a;

    public SetInteger(Integer number, int sizeSet) {
        a = new Boolean[sizeSet];

        for (int i = 0; i < a.length; i++) {
            a[i] = false;
        }
        a[number] = true;
    }

    public SetInteger() {
        for (int i = 0; i < 10; i++) {
            a[i] = false;
        }
    }

    public void setInteger(int number) {
        if (a[number] == true) {
            System.out.println("This number " + (number + 1) + " exist on the set!");
        }

        if (a[number] != true) {
            a[number] = true;
        }
    }

    public Boolean[] getA() {
        return a;
    }

    public String showSetInteger() {
        return Arrays.toString(a);
    }

    public static Boolean[] union(Boolean[] list1, Boolean[] list2) {
        int maxLength = Math.max(list1.length, list2.length);
        Boolean[] list3 = new Boolean[maxLength];

        for (int i = 0; i < list1.length; i++) {
            list3[i] = list1[i];
        }

        for (int i = 0; i < list2.length; i++) {
            if (list2[i] == true) {
                list3[i] = true;
            }
            if (list3[i] == null) {
                list3[i] = false;
            }
        }
        return list3;
    }

    public static String showUnion(Boolean[] setList) {
        return Arrays.toString(setList);
    }
}
