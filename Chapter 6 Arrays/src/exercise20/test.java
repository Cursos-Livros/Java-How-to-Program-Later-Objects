package exercise20;

public class test {
    public static void main(String[] args) {
        double[] numbers = {3.5, 7.2, 10.1};

        System.out.println(findMaxIndex(numbers));
    }

    public static int findMaxIndex(double[] numbers) {
        int maxIndex = 0; // Posição do maior até agora

        for (int i = 1; i < numbers.length; i++) { // Começa do 1, pois 0 já é nossa referência
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex= i;
            }
        }

        return maxIndex;
    }
}
