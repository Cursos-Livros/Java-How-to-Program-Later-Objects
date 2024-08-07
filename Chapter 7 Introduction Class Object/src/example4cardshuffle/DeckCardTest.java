package example4cardshuffle;

public class DeckCardTest {
    public static void main(String[] args) {
        DeckCards myDeckCards = new DeckCards();
        myDeckCards.shuffle();

        // Mostra todas as 52 posicoes do baralho embaralhado
        showDeck(myDeckCards);
    }

    public static void showDeck(DeckCards deckCards) {
        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", deckCards.deal());
            if (i % 4 == 0) { // output a newline after every fourth card
                System.out.println();
            }
        }
    }
}
