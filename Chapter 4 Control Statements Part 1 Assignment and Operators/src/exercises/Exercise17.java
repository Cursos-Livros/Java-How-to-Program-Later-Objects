package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the x1:");
        int x1 = input.nextInt();
        System.out.println("Enter the y1:");
        int y1 = input.nextInt();

        System.out.println("Enter the x2:");
        int x2 = input.nextInt();
        System.out.println("Enter the y2:");
        int y2 = input.nextInt();

        if(x1 == x2){
            System.out.println("Line perpendicular to axis: x");
        } else if (y1 == y2){
            System.out.println("Line perpendicular to axis: y");
        }else{
            System.out.println("Line perpendicular to none axis!");
        }
    }
}
