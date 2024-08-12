package example.example5gradebook;

public class GradeBook {
    private String courseName; // Guarda o nome do curso
    private int[] grades; // Guarda as notas

    // construtor

    public GradeBook(int[] grades, String courseName) {
        this.grades = grades;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void outputGrades() {
        System.out.printf("The grades are: %n%n");

        // Mostra cada nota da tabela de notas
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student: %2d: %3d%n", student + 1, grades[student]);
        }
    }

    public double getAverage() {
        int total = 0;

        for (int grade : grades) {
            total += grade;
        }

        // Essa maneira de fazer a media e bem legal
        // usar o proprio tamanho do array por que ja e a quantidade de elementos
        return (double) total / grades.length;
    }

    public int getMinimum() {
        int lowGrade = grades[0];

        for (int grade : grades) {
            if (grade < lowGrade) {
                lowGrade = grade;
            }
        }
        return lowGrade;
    }

    public int getMaximum() {
        int maximumGrade = grades[0];

        for (int grade : grades) {
            if (grade > maximumGrade) {
                maximumGrade = grade;
            }
        }
        return maximumGrade;
    }

    public void outputBarChart() {
        System.out.println("Grade distribution:");

        // Array que guarda a frequencia que cada nota apareceu
        int[] frequency = new int[11];

        // Este loop percorre nota por nota adicionando um na posicao da nota
        // Exemplo se a nota na posicao[1] = 10 entao frequencia[10] = 1
        // Nesse caso tanto faz se o ++ for colocado agora ou antes
        for (int grade : grades) {
            ++frequency[grade / 10];
        }

        // Printa os *
        for (int count = 0; count < frequency.length; count++) {

            // Primeiro fazer um cabecalho de ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            // Este for precisa estar dentro do outro for
            // Ele imprime uma sequencia de estreças na quantidade do que a frequencia apareceu
            // o count ali auxilia a passar por cada frequencia
            for (int star = 0; star < frequency[count]; star++) {
                System.out.print("*");
            }
        }
    }

    // Faz operacoes com os dados
    public void processGrades() {
        // output das notas
        outputGrades();

        // Chama o metodo get average para calcular a media das notas
        System.out.printf("%nClass average is %.2f%n", getAverage());

        // Chama o maximo e minimo
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(),getMaximum());

        // Mostra a barra de distribuicao das notas
        outputBarChart();
    }
}
