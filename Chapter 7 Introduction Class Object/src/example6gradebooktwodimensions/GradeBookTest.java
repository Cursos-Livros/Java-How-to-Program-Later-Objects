package example6gradebooktwodimensions;

public class GradeBookTest {
    public static void main(String[] args) {
        // Array com a nota dos estudantes
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook myGradeBook = new GradeBook(gradesArray, "CS101 Introduction to Java Programming");
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
