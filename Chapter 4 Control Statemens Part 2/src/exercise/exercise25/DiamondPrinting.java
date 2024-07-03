package exercise.exercise25;

public class DiamondPrinting {
    public static void main(String[] args) {
        int number = 5;
        for (int line = 1; line <= number; line++) {

            for (int row = 1; row <= number - line; row++) {
                System.out.print(" ");
            }
//            A variável line representa o número da linha atual no diamante.
//            Multiplicando line por 2, obtemos o dobro do número da linha.
//            Isso significa que, na linha 1, o valor será 2, na linha 2, será 4, e assim por diante.Após a multiplicação, a expressão subtrai 1 do resultado.
//            Essa subtração garante que o número de asteriscos em cada linha seja ímpar,
//            o que é essencial para a forma do diamante.
//            A expressão line * 2 - 1 é utilizada dentro de um loop que imprime os asteriscos.
//            O número de asteriscos em cada linha é determinado pelo valor da expressão.
//            Nas linhas centrais do diamante, o valor da expressão é maior, resultando em mais asteriscos.
//            Nas linhas superiores e inferiores, o valor da expressão diminui, resultando em menos asteriscos.
//            Essa variação no número de asteriscos cria a forma triangular do diamante.
            for (int row = 1; row <= line * 2 - 1; row++) {
                System.out.print(line);
            }

            // Ending line after each row
            System.out.println();
        }


    }
}
