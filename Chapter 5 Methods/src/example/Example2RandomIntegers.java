package example;
// Pilha de metodos
// Pilha - Lifo Ultimo item a entrar é o primeiro a sair
// Chamada de metodo empilhamento
// pode ser chama de pilha da execucao do programa

// Stack Frame
// A capacidade que um metodo tem de chamar outro metodo antes de seu proprio return

// Stack Overflow
// Quando a pilha de chama do metodo que guarda endereco do metodo chamado para saber para onde retornar
// E tao alta que a memoria nao aguenta
// Ex: looop infinito

//  Promocao conversao de argumento
// Cconverte um argumento em outro tipo
// Exemplo: Math.sqrt(4)

import java.security.SecureRandom;

public class Example2RandomIntegers {
    public static void main(String[] args) {
        // randomNumbers object will produce secure random numbers
        SecureRandom randomNumbers = new SecureRandom();

        // loop 20 times
        for (int counter = 1; counter <= 20; counter++) {
            // pick random integer from 1 to 6
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face); // display generated value

            // if counter is divisible by 5, start a new line of output
            if (counter % 5 == 0) {
                System.out.println();
            }

        }
    }
}
