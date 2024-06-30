package exercise.exercise25;

public class DiamondPrinting {
    public static void main(String[] args) {
        int size = 5;

        for (int line = 1; line <= size; line++) {
            for (int row = 1; row <= size; row++) {
                if (line == 1 && row == size/2) {
                    System.out.print(line + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
