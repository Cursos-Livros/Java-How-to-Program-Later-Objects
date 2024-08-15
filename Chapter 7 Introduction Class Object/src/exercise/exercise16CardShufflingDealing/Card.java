package exercise.exercise16CardShufflingDealing;

/* Essa classe agora funciona de maneira diferente da anterior. Agora ela recebe um naipe e seu numero de outras classes
   Isso acontece por que o dever da carta é conter apenas seu numero e naipe
   Porem se o numero e naipe forem modelados aqui eles irao tera que retornar uma strin e nao um objeto carta
   O que causaria problemas na classe DeckCards ja que um deck de carta e de carta e nao de um tipo primitivo como
   String.
 */
public class Card {
    private final String face;
    private final String suit; //naipes
    Face faces = new Face();
    Suit suits = new Suit();

    // construtor que recebe a carta e o naipe
    public Card(int faceOption, int suitOption) {
        this.face = faces.faceOptions[faceOption];
        this.suit = suits.suitOptions[suitOption];
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    // retorna uma string com a carta e o naipe
    // exe: As de copas
    public String toString() {
        return face + " of " + suit;
    }

}
