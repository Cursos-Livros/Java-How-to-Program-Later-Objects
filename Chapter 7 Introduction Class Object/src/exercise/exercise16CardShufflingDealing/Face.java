package exercise.exercise16CardShufflingDealing;

public class Face {
    // Esse array tem como objetivo criar o numero das cartas
    // Que nada mais e que uma string
    public String[] faceOptions = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Jack", "Queen", "King"};

    public String getFaceOption(int numberFace) {
        return faceOptions[numberFace];
    }
}
