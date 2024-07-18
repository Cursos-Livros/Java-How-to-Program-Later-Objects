package example;

public class example2InitializingArray {
    public static void main(String[] args) {
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
