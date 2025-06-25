package exercise21;

public class TurtleGraphics {
    public static void main(String[] args) {
        int[][] floor = new int[20][20];
        inicializeFloor(floor);

        int[][] commandArray = new int[3][2];
        handleCommands(commandArray);
    }

    public static void inicializeFloor(int[][] floor) {
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                floor[i][j] = 0;
            }
        }
    }

    public static void handleCommands(int[][] commandArray) {

    }
}
