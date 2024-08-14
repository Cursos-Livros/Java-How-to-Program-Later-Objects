package exercise.exercise15enhancedgradebook;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        // Array com a nota dos estudantes
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int numberStudents = input.nextInt();
        System.out.println("Enter the number of grades:");
        int numberGrades = input.nextInt();

        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", numberStudents, numberGrades);

        System.out.println("What you deserve?");
        System.out.println("Press 1 to launch grade for a especified number students:");
        System.out.println("Press 2 to launch grade for a especified student:");
        int option = input.nextInt();

        if (option == 1) {
            for (int i = 0; i < numberStudents; i++) {
                for (int j = 0; j < numberGrades; j++) {
                    myGradeBook.setGrades(i, j, grade(input));
                }
            }
        } else if (option == 2) {
            myGradeBook.setGrades(studentNumber(input) - 1, studentGrade(input) - 1, grade(input));
        }

        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }

    public static int studentNumber(Scanner input) {
        System.out.println("Enter the number of the student:");
        int studentNumber = input.nextInt();

        return studentNumber;
    }

    public static int studentGrade(Scanner input) {
        System.out.println("Enter the first grade of the student:");
        int studentGrade = input.nextInt();

        return studentGrade;
    }

    public static int grade(Scanner input) {
        System.out.println("Enter the grade");
        int grade = input.nextInt();

        return grade;
    }


}
