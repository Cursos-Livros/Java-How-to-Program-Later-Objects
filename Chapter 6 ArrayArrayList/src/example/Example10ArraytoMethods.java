package example;

// Passagem por valor
// Passa um copia do valor nao modifica o original
// Entao nao altera o valor

// Passagem por referencia
// Passsa o endereco de memoria ous seja o original

// Por que usar um ou outro passagem por valor utilizando array causaria um problema de espaço de memoria ja que
// precisaria duplicar o array todo para utilizar a copia
// Elementos do array também sao passados como referencia, ou seja nao sao alterados no original


// Java nao permite escolher entre passagem por valor e por referencia

public class Example10ArraytoMethods {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Effects of passing reference to entire array:");
        System.out.println("The values of the original array are:%n");

        // output original array elements
        for (int value : array) {
            System.out.printf(" %d", value);
        }

        // pass array reference
        modifyArray(array);

        System.out.printf("%n%nThe values of the modified array are:%n");

        for (int value : array) {
            System.out.printf(" %d", value);
        }

        System.out.printf("%n%nEffects of passing array element value:%n" +
                          "array[3] before modifyElement: %d%n", array[3]);

        modifyElement(array[3]); // attempt to modify array[3]

        System.out.printf("array[3] after modifyElement: %d%n", array[3]);

    }

    // multiply each element of an array by 2
    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    // multiply argument by 2
    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf(
                "Value of element in modifyElement: %d%n", element);
    }
}
