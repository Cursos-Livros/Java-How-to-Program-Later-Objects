package exercise.exercise16CardShufflingDealing;

import java.util.Arrays;

public class DeckCardTest {
    public static void main(String[] args) {
        DeckCards myDeckCards = new DeckCards();
        Card[] hand = new Card[5];

        myDeckCards.shuffle();

        for (int numberCards = 0; numberCards < 5; numberCards++) {
            hand[numberCards] = myDeckCards.deal();
        }
        // Mostra todas as 52 posicoes do baralho embaralhado
        showDeck(hand);
    }

    public static void showDeck(Card[] hand) {
        for (int i = 0; i <= hand.length - 1; i++) {
            System.out.println("hand = " + hand[i]);
        }
    }
}
