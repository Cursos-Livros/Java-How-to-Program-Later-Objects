package exercise.exercise16CardShufflingDealing;

import java.util.Arrays;

public class DeckCardTest {
    public static void main(String[] args) {
        DeckCards myDeckCards = new DeckCards();
        myDeckCards.shuffle();
        Hand hand = new Hand(5, myDeckCards);

        System.out.println(Arrays.toString(hand.getHand()));
        System.out.println(hand.toString());
    }
}
