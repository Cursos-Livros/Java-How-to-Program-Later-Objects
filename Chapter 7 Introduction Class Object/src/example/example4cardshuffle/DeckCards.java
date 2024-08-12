package example.example4cardshuffle;

import java.security.SecureRandom;

public class DeckCards {
    // gerador numero aleatorio
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52; // constantes de cartas para usar no gerador de cartas

    private Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0; // Marca a posicao para ser tratada 0 - 51

    public DeckCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Popula deck com objetos card
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    // embaralha o deck de cartas
    // algoritmo one pass
    public void shuffle() {
        // toda chamada de metodo o deck tem que comecar na posica deck[0] again
        currentCard = 0;

        // for each Card, pick another random Card (0-51) and swap them
        /*
        O algoritmo passa por todos os elementos do array trocando a carta da posicao atual (ou primeira posicao)
        deck[first] pela carta da posicao second deck[second] que é uma posicao aleatoria e depois coloca na posicao
        aleatoria a carta que estava guardada em temp ou seja a posicao atual
         */
        for (int first = 0; first < deck.length; first++) {
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    // Distribui uma carta
    public Card deal(){
        // determina se a cartas para serem distribuidas
        // se a carta atual for maior ou igual a 52 quer dizer que todas as cartas foram distribuidas
        // Lembre-se currentCard++ garante que a sera sempre uma posicao a frente
        if(currentCard < deck.length){
            return deck[currentCard++];
        }else{
            return null;
        }
    }
}

