package exercise;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Exercise12DuplicateElimination {
    public final static Integer SIZE = 10;

    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        Integer[] array1 = new Integer[SIZE];
        ArrayList<Integer> array2 = new ArrayList<Integer>(SIZE);

        setElementsArrayLess1(array1, randomNumber);
        setElementsArrayListLess1(array2, randomNumber);

        setRandomElements(array1, randomNumber);
        setRandomElementsArrayList(array2, randomNumber);

        // Ordena o array
        // Necessario ordenar o array para que todos os numeros estejam em ordem isso garante que nenhum numero ira aparecer em uma posicao aleatorio
        // ou seja 1,2,3,4,3,2,1,5
        // vai virar 1,1,2,2,3,3,4,5
        sortArray1(array1);



        System.out.println(Arrays.toString(removingDuplicates(array1)));
        System.out.println(array2);
    }

    public static Integer[] setElementsArrayLess1(Integer[] array1, SecureRandom randomNumber) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = -1;
        }

        return array1;
    }

    public static ArrayList<Integer> setElementsArrayListLess1(ArrayList<Integer> array2, SecureRandom randomNumber) {
        // Deve se usar o size e nao o array size, por que o array ainda nao esta preenchido
        for (int i = 0; i < SIZE; i++) {
            // Nao se deve usar set pois set substitui valores que ja existem
            array2.add(i, less1());
        }
        return array2;
    }

    public static Integer less1() {
        return -1;
    }

    public static Integer[] setRandomElements(Integer[] array1, SecureRandom randomNumber) {

        for (int i = 0; i < array1.length; i++) {
            Integer number = 1 + randomNumber.nextInt(10);
            array1[i] = number;
        }
        return array1;
    }

    public static ArrayList<Integer> setRandomElementsArrayList(ArrayList<Integer> array2, SecureRandom randomNumber) {
        for (int i = 0; i < SIZE; i++) {
            Integer number = 1 + randomNumber.nextInt(10);
            array2.set(i, number);
        }

        return array2;
    }

    public static Integer[] sortArray1(Integer[] array1) {
        Arrays.sort(array1);
        return array1;
    }

    public static Integer[] removingDuplicates(Integer[] array1) {
        int size = array1.length;

        if (size == 0 || size == 1) {
            return array1;
        }

        Integer[] temporaryArray = new Integer[size];
        int j = 0;


        for (int i = 0; i < size - 1; i++) {
            if (!Objects.equals(array1[i], array1[i + 1])) {
                temporaryArray[j++] = array1[i];
            }
        }

        // Adicionar o último elemento
        // Isto se faz necessario pois o ultimo elemento fica de fora da comparacao
        // Exemplo:
        // 1,2,2,2
        // 1 e diferente de 2 vai pro array temporario 1
        // 2 e diferente de 2 nao entao nao vai
        // 2 e diferente de 2 nao entao nao vai
        // so que o ultimo nao compara pois ele seria comparado com uma posicao ixexistente
        // como o array e ordenado se ele for igual ou nao agora ele tera de entrar
        // se for igual quer dizer que os outros iguais nao entraram
        // se for diferente também iria entrar

        // sobre o j++ como ele foi criado fora do array ele aqui esta na ultima posicao
        // pois o loop do for vai ate a penultima posicao
        temporaryArray[j++] = array1[size - 1];

        // Cria um array com o tamanho exato de j
        // Isso é necessario pois
        // temporary array tem o tamanho de array 1
        // Entao Integer[] array1 = {1, 1, 1, 2, 3, 5};
        // temporaryArray = [1, 2, 3, 5, null, null];
        // Entao tem que se criar um array que tenha o tamanho de j que e o numero de elementos que foram diferentes que foram duplicado
        // Depois copiar tudo do temporary para o array novo
        Integer[] copyTemporaryWithoutNulls = new Integer[j];
        System.arraycopy(temporaryArray, 0, copyTemporaryWithoutNulls, 0, j);

        return copyTemporaryWithoutNulls;
    }
}
