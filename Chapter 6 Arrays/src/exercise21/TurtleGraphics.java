package exercise21;

import java.util.Scanner;

//Em Turtle Graphics (gráficos)
//Turtle (como na biblioteca StdDraw, TurtleGraphics ou Processing) geralmente desenha usando coordenadas cartesianas (x, y), como em gráficos matemáticos:
//
// (x →) horizontal → coluna
// (y ↓) vertical   ↓ linha
// Ou seja:
//
//  x = coluna
//  y = linha
//
// Por isso, na hora de desenhar, você costuma inverter:
// grid[coluna][linha] — ou grid[x][y] — porque a ordem esperada pela função gráfica é essa!

// Quando estiver com gráficos ou mapas, pense em:
// Posição no plano → x antes de y

public class TurtleGraphics {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner input = new Scanner(System.in);
        Character[][] floor = new Character[10][10];
        int currentCommand = 0;
        int currentDirection = 0;
        int currentPositionY = 0;
        int currentPositionX = 0;
        int lastPositionX = 0;
        int lastPositionY = 0;
        int penStatus = 0;
        char turtle = 'T';
        int exit = 0;

        initiateFloor(floor);

        while (exit == 0) {
            System.out.println("Menu");
            showMenu();

            currentCommand = commandOption(input, currentCommand);

            switch (currentCommand) {
                case 1:
                    penStatus = penUp();
                    break;
                case 2:
                    penStatus = penDown();
                    break;
                case 3:
                    currentDirection = turnRight(currentDirection);
                    break;
                case 4:
                    currentDirection = turnLeft(currentDirection);
                    break;
                case 5:
                    lastPositionX = currentPositionX;
                    lastPositionY = currentPositionY;
                    currentPositionX += moveForwardX(currentDirection, currentPositionX, floor);
                    currentPositionY += moveForwardY(currentDirection, currentPositionY, floor);
                    // This method is here too can T -> * or ||
                    positionateElements(floor, lastPositionX, lastPositionY, currentPositionX, currentPositionY, penStatus, turtle);
                    break;
                case 6:
                    showFloor(floor);
                    break;
                case 9:
                    exit = 1;
                    break;
            }
        }


    }

    public static void initiateFloor(Character[][] floor) {
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                floor[i][j] = ' ';
            }
        }
    }

    public static void showMenu() {
        System.out.print("Command   Meaning \n");
        System.out.print("  1         Pen up \n");
        System.out.print("  2         Pen down \n");
        System.out.print("  3         Turn right\n");
        System.out.print("  4         Turn left \n");
        System.out.print("  5         Move forward \n");
        System.out.print("  6         Show floor\n");
        System.out.print("  9         End of data\n");
    }

    public static int commandOption(Scanner input, int currentCommand) {
        System.out.println("Enter with the command option:");
        currentCommand = input.nextInt();

        while (!checkCommandOption(currentCommand)) {
            System.out.println("This option" + currentCommand + "is not allowed.");
            showMenu();
            System.out.println("Enter with one of this options again:");
            currentCommand = input.nextInt();
        }

        return currentCommand;
    }

    public static boolean checkCommandOption(int currentCommand) {
        return currentCommand >= 1 && currentCommand <= 6 || currentCommand == 9;
    }

    public static int penUp() {
        return 0;
    }

    public static int penDown() {
        return 1;
    }

    public static int turnRight(int currentDirection) {
        return (currentDirection + 1) % 4; // Modular Aritmethic
    }

    public static int turnLeft(int currentDirection) {
        return (currentDirection - 1 + 4) % 4;
    }

    // Verificar o por que quando avança no Y ele recomeça na linha
    public static int moveForwardX(int currentDirection, int currentX, Character[][] floor) {
        // Moves one to forward and create the east limit forward
        if (currentDirection == 1) {
            if ((currentX + 1) < floor[0].length) {
                return 1;
            } else {
                System.out.println("This movement it's between the limits of floor for the east side!");
            }
        }

        // Moves one to forward and create the east limit forward
        if (currentDirection == 3) {
            if ((currentX - 1) >= 0) {
                return -1;
            } else {
                System.out.println("This movement it's between the limits of floor for the west side!");
            }
        }

        return 0;
    }

    public static int moveForwardY(int currentDirection, int currentY, Character[][] floor) {
        // Moves one to forward and create the north limit forward
        if (currentDirection == 0) {
            if ((currentY - 1) >= 0) {
                return -1;
            } else {
                System.out.println("This movement it's between the limits of floor for the North side!");
            }
        }

        // Moves one to forward and create the south limit forward
        if (currentDirection == 2) {
            if ((currentY + 1) < floor.length) {
                return 1;
            } else {
                System.out.println("This movement it's between the limits of floor for the South side!");
            }
        }

        return 0;
    }

    public static void positionateElements(Character[][] floor, int lastPositionX, int lastPositionY, int currentX,
                                           int currentY, int penStatus, char turtle) {

            if (penStatus == penDown()) {
                floor[lastPositionY][lastPositionX] = '*';
            }
            if (penStatus == penUp()) {
                floor[lastPositionY][lastPositionX] = ' ';
            }

        floor[currentY][currentX] = turtle;

        System.out.printf("Turtle is now at (%d, %d)\n", currentX, currentY);
    }

    public static void showFloor(Character[][] floor) {
        showHead(floor);
        showSeparatesLine(floor);

        for (int row = 0; row < floor.length; row++) {
            System.out.printf("%2d |", row);
            for (int col = 0; col < floor[row].length; col++) {
                System.out.printf(" %c ", floor[row][col]);
            }
            System.out.println();
        }
    }

    public static void showHead(Character[][] floor) {
        // Cabeçalho das colunas
        System.out.print("    "); // espaço para alinhar com os índices de linha
        for (int col = 0; col < floor[0].length; col++) {
            System.out.printf("%2d ", col);
        }
        System.out.println();
    }

    public static void showSeparatesLine(Character[][] floor) {
        // Linha horizontal separadora
        System.out.print("   +");
        for (int col = 0; col < floor[0].length; col++) {
            System.out.print("---");
        }
        System.out.println();
    }
}



