package exercise.exercise13;

import java.lang.reflect.Array;
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
        if (a[number] != true) {
            a[number] = true;
        }

        if (a[number] == true) {
            System.out.println("This number " + (number + 1) + " exist on the set!");
        }
    }

    public String showSetInteger() {
        return Arrays.toString(a);
    }
}
