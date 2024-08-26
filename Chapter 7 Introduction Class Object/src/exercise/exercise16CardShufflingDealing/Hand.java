package exercise.exercise16CardShufflingDealing;

public class Hand {
    private int size; // se nao for possivel saber o tamanho logo de cara
    // melhor usar essa maneira, inicie o array no construtor
    private Card[] hand;
    private DeckCards deckCards; // Cuidado ao instanciar a classe aqui pois pode criar inumeros objetos dessa classe
    // desnecessariamente

    public Hand(int size, DeckCards deck) {
        this.size = size;
        this.hand = new Card[size];  // Inicializa o array com o tamanho correto
        this.deckCards = deck;

//      Ao criar uma classe que tenha composicao de mais de uma classe
//      Deve-se prestar atencao se a instanciacao da classe sendo feita no atributo
//      Nao esta criando ocorrencias da classe que esta compondo atoa
//      Para resolver isto apenas inicie os atributos com o construtor
        for (int card = 0; card < size; card++) {
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

    public boolean hasOnePair() {
        String[] faces = new String[hand.length]; // Array para receber numero de cartas
        int[] counts = new int[hand.length]; // Array para contar o numero de vezes que uma determinada string que e
        // o valor da carta apareceu

        // Preenche um array de faces
        // faces sao strings
        for (int card = 0; card < hand.length; card++) {
            faces[card] = hand[card].getFace();
        }

        // Conta a ocorrencia de cada carta
        for (String faceValue : faces) {
            int index = findIndex(faces, faceValue, 0);
            if (index != -1) {
                counts[index]++;
            }
        }

        //Conta as ocorrências de cada carta
        boolean hasPair = false;
        int indexHand = 0;
        for (int count : counts) {
            if (count == 2) {
                if (hasPair) {
                    return false;
                }
                hasPair = true;
                System.out.println(hand[indexHand].getFace());
            } else if (count > 2) {
                return false;
            }
            indexHand++;
        }



        return hasPair;
    }

    // Funcao auxiliar para encontrar o indice da face em um array
    private int findIndex(String[] array, String faceTarget, int start) {
        for (int i = start; i < array.length; i++) {
            if (array[i].equals(faceTarget)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Has one pair: " +  hasOnePair() ;
    }
}


//    Essa versao do codigo nao e tao performatica
//    public void onePair() {
//        int apparitions = 0;
//        String cardOne = "";
//        String cardTwo = "";
//        String currentCard = "";
//
//        for (int card = 0; card < hand.length; card++) {
//            currentCard = hand[card].getFace();
//            // Esse loop sera executado e sempre voltar para o loop acima antes de ir para o pedaco final do codigo
//            for (int nextCard = card + 1; nextCard < hand.length; nextCard++) { // A indice da proxima carta comeca em card + 1
//                if (Objects.equals(currentCard, hand[nextCard].getFace())) { // E possivel fazer diferente utilizando hand[card].getFace()
//                    apparitions++;
//                    cardOne = hand[card].getFace();
//                    cardTwo = hand[nextCard].getFace();
//                }
//            }
//        }
//
//        if (apparitions == 1) {
//            showOnePair(cardOne, cardTwo);
//        }
//    }

//    public void showOnePair(String cardOne, String cardTwo) {
//        System.out.println("Found a pair:");
//        System.out.println(cardOne + " and " + cardTwo);
//    }



