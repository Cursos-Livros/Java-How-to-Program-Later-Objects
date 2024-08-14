package exercise.exercise15enhancedgradebook;

public class GradeBook {
    private String courseName; // Guarda o nome do curso
    private int[][] grades; // Guarda as notas

    public GradeBook(String courseName, int numberStudents, int numberGrades) {
        grades = new int[numberStudents][numberGrades];
        this.courseName = courseName;
        fillGrades(numberStudents, numberGrades);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private void fillGrades(int numberStudents, int numberGrades) {
        for (int student = 0; student < numberStudents; student++) {
            for (int grade = 0; grade < numberGrades; grade++) {
                grades[student][grade] = -1;
            }
        }
    }

    public void setGrades(int student, int gradeNumber, int grade) {
        grades[student][gradeNumber] = grade;
    }

    public void outputGrades() {
        System.out.printf("The grades are: %n%n");
        System.out.print("          "); // alinha o cabecalho de cada campo

        // O comando grades[0].length o grade[0] garante que esse loop ira percorrer somente o primeiro array
        // Nesse caso os arrays mostram os campos
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d ", test + 1);
        }

        System.out.println("Average"); // media do estudante

        // cria colunas e linhas de texto representando array notas

        for (int students = 0; students < grades.length; students++) {
            System.out.printf("Student %2d", students + 1);

            for (int test : grades[students]) {
                System.out.printf("%8d", test);
            }
            // Mostra cada nota da tabela de notas
            // Aqui se percorre apenas os campos da notas
            // Se liga nas execucoes o metodo so sera chamado com valores
            double average = getAverage(grades[students]);
            System.out.printf("%9.2f%n", average);
        }
    }

    // Aqui se torna necessario o parametro pois so assim e possivel receber apenas um dos conjuntos de nota
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        for (int grade : setOfGrades) {
            total += grade;
        }

        // Essa maneira de fazer a media e bem legal
        // usar o proprio tamanho do array por que ja e a quantidade de elementos
        return (double) total / setOfGrades.length;
    }

    public int getMinimum() {
        int lowGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    public int getMaximum() {
        int maximumGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > maximumGrade) {
                    maximumGrade = grade;
                }
            }
        }
        return maximumGrade;
    }

    public void outputBarChart() {
        System.out.println("Grade distribution:");

        // Array que guarda a frequencia que cada nota apareceu
        int[] frequency = new int[11];

        // Para cada nota adicione um frequencia
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
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
            System.out.println();
        }
    }

    // Faz operacoes com os dados
    public void processGrades() {
        // output das notas
        outputGrades();

        // Chama o metodo get average para calcular a media das notas
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimum(), "Highest grade in the grade book is", getMaximum());
        outputBarChart();
    }
}
