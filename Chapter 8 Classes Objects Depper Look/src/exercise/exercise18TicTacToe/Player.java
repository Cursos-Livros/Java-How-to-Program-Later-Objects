package exercise.exercise18TicTacToe;

import java.util.Random;

public class Player {
    private final Character playerPiece;
    private Integer playerPositionX;
    private Integer getPlayerPositionY;

    public Player(char piece) {
        this.playerPiece = piece;
    }

    public Character getPlayerPiece() {
        return playerPiece;
    }

    public Integer automaticPlay() {
        return generateCell();
    }

    private Integer generateCell(){
        Random integer = new Random();
        return integer.nextInt(3) + 1;
    }
}
