package example4cardshuffle;

public class Card {
    private final String face;
    private final String suit; //naipes

    // construtor que recebe a carta e o naipe
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }


    // retorna uma string com a carta e o naipe
    // exe: As de copas
    public String toString(){
        return face + " of " + suit;
    }
}
