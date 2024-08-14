package exercise.exercise16CardShufflingDealing;

public class Card {
//    private String face;
//    private String suit;

    private final String[] faceOptions = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Jack",
            "Queen", "King"};
    private final String[] suitOptions = {"Hearts", "Diamonds", "Clubs", "Spades"}; //naipes

    public faceGenerator (int face) {
        return faceOptions[face] ;
    }

    public suitGenerator (int suitType) {
        return suitOptions[s];
    }

}
