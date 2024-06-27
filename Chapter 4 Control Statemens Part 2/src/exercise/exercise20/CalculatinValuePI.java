package exercise.exercise20;

public class CalculatinValuePI {
    public static void main(String[] args) {
        int term = 200000;
        double denominator = 1.0;
        double result = 0.0;

        for (int i = 1; i <= term; i++) {
            if (i % 2 != 0) {
                result += 4.0 / denominator;
            } else {
                result -= 4.0 / denominator;
            }

            if (result >= 3.141592 && result < 3.141593) {
                break;
            }
            denominator += 2;
            System.out.println(result);
        }
    }
}
