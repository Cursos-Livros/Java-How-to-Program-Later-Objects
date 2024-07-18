package example;

/* Tipo Primitivo
   Tipos primtivos guardam exatamente um valor daquele tipo por vez.
   Ex: int, long, short, double
   Uma variavel do tipo int so pode guardar apenas um valor do tipo int e se o valor for reatribuido novamente o valor anterior é perdido.

   Tipos referencia (ponteiro)
   Guarda a referencia de um objeto.
   Ex: Scanner input = new Scanner(System.in) cria um objeto da classe scanner
   E atribui a variavel input esse objeto
   por fim usa a variavel input para chamar um metodo da classe
   int number = input.nextInt();

   Arrays
   Conjunto de variaveis do mesmo tipo.
   Sao objetos entao sao do tipo referencia.
   As posicoes sao chamadas de indices.
   Indices podem conter expressao de acesso aos indices para mudar as posicoes.
   Indices sao inteiros nao negativos;

   Declarando Arrays
   int[] c = new int[12];
   int[] c;
   c = new int[12];
   Sempre iniciam com 0 inteiros, false booleanos, null para referencias.
   String[] b = new String[100], x = new String[27];
   String[] b = new String[100]; // create array b
   String[] x = new String[27];
 */
public class example1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.printf("%sd%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}