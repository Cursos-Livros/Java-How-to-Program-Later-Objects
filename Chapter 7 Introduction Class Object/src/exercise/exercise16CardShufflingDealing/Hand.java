package exercise.exercise16CardShufflingDealing;

import java.util.Objects;

public class Hand {
    private int size; // se nao for possivel saber o tamanho logo de cara
    // melhor usar essa maneira, inicie o array no construtor
    private Card[] hand;
    private DeckCards deckCards; // Cuidado ao instanciar a classe aqui pois pode criar inumeros objetos dessa classe
    // desnecessariamente

    public Hand(int size, DeckCards deck) {
        this.size = size;
        // O problema aqui é que array nao é dinamico, uma vez que seja iniciado com 0 da nao é possivel atualizar
        // seu tamanho
        this.hand = new Card[size];  // Inicializa o array com o tamanho correto
        this.deckCards = deck;
//      Preste atencao nisto
//      Ao criar uma classe que tenha composicao de mais de uma classe
//      Deve-se prestar atencao se a instanciacao da classe sendo feita no atributo
//      Nao esta criando ocorrencias da classe que esta compondo atoa
//      Para resolver isto apenas inicie os atributos com o construtor
        for (int card = 0; card < size; card++){
            hand[card] = deckCards.deal();
        }
    }

    //      Exemplo do codigo antigo com o erro
//    int size = 0;
//    private Card[] hand = new Card[size];
//    private DeckCards deckCards = new DeckCards();
//
//    public Hand(Integer size) {
//        this.size = size;
//    }

    public Card[] getHand() {
        for (int card = 0; card < hand.length; card++) {
            hand[card] = deckCards.deal();
        }
        return hand;
    }

    public void onePair() {
        int apparitions = 0;

        for (int card = 0; card < hand.length; card++) {
            String currentCard = hand[0].getFace();

            // Nao se esqueca que e posicao da frente
            for (int nextCard = card + 1; nextCard < hand.length; nextCard++) {
                if (Objects.equals(currentCard, hand[nextCard].getFace())) {
                    showOnePair(apparitions, card, nextCard);
                }
            }
        }
    }

    public String showOnePair(int apparition, int card, int nextCard) {
        System.out.println("Found a pair:");
        return hand[card] + " and " + hand[nextCard];
    }
}
