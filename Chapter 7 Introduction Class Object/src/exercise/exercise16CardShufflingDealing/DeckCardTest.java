package exercise.exercise16CardShufflingDealing;

import java.util.Arrays;

public class DeckCardTest {
    public static void main(String[] args) {
        DeckCards myDeckCards = new DeckCards();
        Hand hand = new Hand(5, myDeckCards);

//        O problema agora e que estamos recebendo cartas iguais mesmo naipe e mesmo numero
        System.out.println(Arrays.toString(hand.getHand()));
        hand.onePair();


        // Mostra todas as 52 posicoes do baralho embaralhado
        //showDeck(hand);
    }

    public static void showDeck(Card[] hand) {
        for (int i = 0; i <= hand.length - 1; i++) {
            System.out.println("hand " + (i + 1) + " = " + hand[i]);
        }
    }
}
