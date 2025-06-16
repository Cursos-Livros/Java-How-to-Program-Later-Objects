package exercise19;

import java.util.Scanner;

public class AirlineReservationsSystem {
    private enum SetSeatStatus {TRUE, FALSE}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SetSeatStatus[] seats = new SetSeatStatus[10];

        initiateSeats(seats); // inicia os assentos todos com status false

        System.out.println("\t--- Seats Status ---");
        showSeatStatus(seats);

        System.out.println("Enter with the type of classe");
        System.out.println("1 - Is for VIP class: (1-5)");
        System.out.println("2 - Is for Economic class: (1-5)");
        int classOption = input.nextInt();

        while (!verifyClassOption(classOption)) {
            System.out.println("Enter the type of class again:");
            System.out.println("1 - Is for VIP class: (1-5)");
            System.out.println("2 - Is for Economic class: (1-5)");
            classOption = input.nextInt();
        }

        showTypeClass(classOption);

        if (classOption == 1) {
            showSeatAvaiableClassVip(classOption, seats);
        } else {
            showSeatAvaiableClassEconomic(classOption, seats);
        }

        boolean stopBook = false;

        while (!stopBook && !verifyFullBooking(seats)) {
            System.out.println("Enter with the number of the seat:");
            int seatsOption = input.nextInt();

            assignSeat(classOption, seats, seatsOption);

            System.out.println("Want finish the booking?");
            System.out.println("Enter 1 to yes:");
            System.out.println("Enter 2 to no:");
            int finishOption = input.nextInt();

            if (!verifyFinishOption(finishOption)) {
                finishOption = fixFinishOption(finishOption, input);
            }

            if(finishOption == 2){
                break;
            }
        }

        showSeatStatus(seats);
    }

    public static void initiateSeats(SetSeatStatus[] seats) {
        for (int i = 0; i < seats.length; i++) {
            seats[i] = SetSeatStatus.FALSE;
        }
    }

    public static void showSeatStatus(SetSeatStatus[] seat) {
        for (int i = 0; i < seat.length; i++) {
            System.out.printf("Seat %d: %s ", (i + 1), seat[i]);

            if (i % 2 == 1) { // controla quanto quebrar a linha
                System.out.println();
            }
        }
    }

    public static boolean verifyClassOption(int classOption) {
        return classOption == 1 || classOption == 2;
    }

    public static void showTypeClass(int classOption) {
        switch (classOption) {
            case 1:
                System.out.println("The choose class is VIP;");
                break;
            case 2:
                System.out.println("The choose class is Economic;");
                break;
        }
    }

    public static boolean verifyFullBooking(SetSeatStatus[] seats) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == SetSeatStatus.FALSE) {
                return false;
            }
        }
        System.out.println("Next flight leaves in 3 hours");
        return true;
    }

    public static void showSeatAvaiableClassVip(int classOption, SetSeatStatus[] seats) {
        int vipLimitSeat = seats.length / 2;

        System.out.println("Avaiable seats on VIP class:");
        for (int i = 0; i < vipLimitSeat; i++) {
            System.out.printf("Seat %d: %s ", (i + 1), seats[i]);

            if (i % 2 == 1) { // controla quanto quebrar a linha
                System.out.println();
            }
        }
    }

    public static void showSeatAvaiableClassEconomic(int classOption, SetSeatStatus[] seats) {
        int vipLimitSeat = seats.length / 2;

        System.out.println("Avaiable seats on Economic class:");
        for (int i = 0; i < vipLimitSeat; i++) {
            System.out.printf("Seat %d: %s ", (i + 1), seats[i]);

            if (i % 2 == 1) { // controla quanto quebrar a linha
                System.out.println();
            }
        }
    }

    public static boolean verifyFinishOption(int finishOption) {
        return finishOption == 1 || finishOption == 2;
    }

    public static int fixFinishOption(int finishOption, Scanner input) {
        int finishOptionTemporary = finishOption;

        while (!verifyFinishOption(finishOption)) {
            System.out.println("this option " + finishOption + " it's not allowed.");
            finishOption = input.nextInt();
        }

        return finishOptionTemporary;
    }

    public static void assignSeat(int classOption, SetSeatStatus[] seats, int seatNumber) {
        seats[seatNumber -1] = SetSeatStatus.TRUE;
    }
}
