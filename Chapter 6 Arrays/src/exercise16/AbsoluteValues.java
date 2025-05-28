package exercise16;

public class AbsoluteValues {

    public static void main(String[] args) {
        int[] array = {-1, 2, 3, 4, -6};

        for (int number : array) {
            try {
                int absoluteValue = Math.abs(number);
                System.out.println("Absolute value of " + number + " is: " + absoluteValue);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + number + " is not an integer.");
            }
        }
    }
}