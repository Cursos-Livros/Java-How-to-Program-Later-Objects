package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise19ArilineReservation {

    public static final int NUMBER_SEATS = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Boolean> seats = new ArrayList<>(NUMBER_SEATS);

        // Initialize seats
        initializeSeats(seats);
        // Showseats
        showSeats(seats);
        boolean quit = false;

        while (quit == false) {
            System.out.println("Please type 1 for First Class:");
            System.out.println("Please type 2 for Economy:");
            int typeAssent = input.nextInt();

            while (!checkTypeAssent(typeAssent)) {
                typeAssent = fixTypeAssent(input);
            }

            seatReservation(typeAssent, seats);
            showSeats(seats);

            quit = !continueReservation(input);
        }

        input.close();
    }

    public static boolean checkTypeAssent(int typeAssent) {
        return typeAssent == 1 || typeAssent == 2;
    }

    public static int fixTypeAssent(Scanner input) {
        int newTypeAssent = 0;

        while (newTypeAssent != 1 && newTypeAssent != 2) {
            System.out.println("This option " + newTypeAssent + "it's incorrect!");
            System.out.println("Please type 1 for First Class:");
            System.out.println("Please type 2 for Economy:");
            newTypeAssent = input.nextInt();
        }
        return newTypeAssent;
    }

    public static void initializeSeats(ArrayList<Boolean> seats) {
        for (int i = 0; i < NUMBER_SEATS; i++) {
            seats.add(Boolean.FALSE);
        }
    }

    public static void showSeats(ArrayList<Boolean> seats) {
        int seatNumber = 1;
        for (boolean seat : seats) {
            System.out.println("Seat " + seatNumber + ": " + seat);
            seatNumber++;
        }
    }

    public static void seatReservation(int reservation, ArrayList<Boolean> seats) {
        if (reservation == 1) {
            firstClassReservation(seats);
        }

        if (reservation == 2) {
            economicReservation(seats);
        }
    }

    public static void firstClassReservation(ArrayList<Boolean> seats) {
        for (int i = 0; i < seats.size() / 2; i++) {
            if (seats.get(i) == Boolean.FALSE) {
                seats.set(i, Boolean.TRUE);
                break;
            }
        }
    }

    public static void economicReservation(ArrayList<Boolean> seats) {
        for (int i = seats.size() / 2; i < seats.size(); i++) {
            if (seats.get(i) == Boolean.FALSE) {
                seats.set(i, Boolean.TRUE);
                break;
            }
        }
    }

    public static boolean continueReservation(Scanner input) {
        System.out.println("Wish continue reservation?");
        System.out.println("Enter y to yes and n to no:");
        char option = input.next().toLowerCase().charAt(0);

        if (!checkOption(option)) {
            option = fixOption(input);
        }

       return option == 'y';
    }

    public static boolean checkOption(char option) {
        return option == 'y' || option == 'n';
    }

    public static char fixOption(Scanner input) {
        char newOption = ' ';
        while (newOption != 'y' && newOption != 'n') {
            System.out.println("This option doesn't exist");
            System.out.println("Enter y for yes and n for no:");
            newOption = input.next().toLowerCase().charAt(0);
        }
        return newOption;
    }
}
