package exercise28;

import java.security.SecureRandom;

public class TortoiseHare {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        SecureRandom time = new SecureRandom();
        char hare = 'H';
        char tortoise = 'T';

        int[] course = new int[70];

        int harePosition = 0;
        int tortoisePosition = 0;

        // Se ligue na verificação do 0
        for (int i = 0; i < 5; i++) {
            int percentageTime = getPercentageOfTime(time);
            harePosition += getMoveHare(percentageTime);
            tortoisePosition += getMoveTortoise(percentageTime);
        }
    }

    public static int getPercentageOfTime(SecureRandom time) {
        return time.nextInt(10) + 1;
    }

    public static int getMoveHare(int percentageOfTime) {
        int move = 0;
        return move = switch (percentageOfTime) {
            case 3, 4 -> 9;
            case 5 -> -12;
            case 6, 7, 8 -> 1;
            case 9, 10 -> -2;
            default -> 0;
        };
    }

    public static int getMoveTortoise(int percentageOfTime) {
        int move = 0;
        return move = switch (percentageOfTime) {
            case 1, 2, 3, 4, 5 -> 3;
            case 6, 7 -> -6;
            case 8, 9, 10 -> -2;
            default -> 0;
        };
    }
}

