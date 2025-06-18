package exercise19;

import java.util.Scanner;

public class AirlineReservationsSystem {
    private enum SetSeatStatus {TRUE, FALSE}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SetSeatStatus[] seats = new SetSeatStatus[10];

        initiateSeats(seats); // inicia os assentos todos com status false
        displaySeatStatus(seats);

        int classOption = getClassType(input);
        boolean stopBook = false;

        while (!stopBook && !verifyFullBooking(seats)) {

            stopBook = keepingReservation(input);
        }
//            showTypeClass(classOption);
//
//            if (classOption == 1) {
//                showSeatAvaiableClassVip(seats);
//            } else {
//                showSeatAvaiableClassEconomic(seats);
//            }
//
//            System.out.println();
//            System.out.println("Enter with the number of the seat:");
//            int seatsOption = input.nextInt();
//
//            while (!verifySeatsOption(seatsOption, classOption, seats)) {
//                if (classOption == 1) {
//                    System.out.println("You choose the Vip class:");
//                    seatsOption = fixSeatOptionVip(seats, input);
//
//                    if (!verifyClassVipStatus(seats) && verifySeatStatus(seats, seatsOption)) {
//                        assignSeat(classOption, seats, seatsOption);
//                    } else if (!verifyClassEconomicStatus(seats)) {
//                        System.out.println("Vip is full!");
//                        showSeatAvaiableClassEconomic(seats);
//                        System.out.println("Enter a new seat on the economic class: ");
//                        seatsOption = fixSeatOptionEconomic(seats, input);
//                        assignSeat(classOption, seats, seatsOption);
//                    } else {
//                        System.out.println("\"Next flight leaves in 3 hours.\"\n");
//                    }
//                } else {
//                    System.out.println("You choose the Economic class:");
//                    seatsOption = fixSeatOptionEconomic(seats, input);
//                }
//            }
//
//            if (!verifyClassVipStatus(seats) && verifySeatStatus(seats, seatsOption)) {
//                assignSeat(classOption, seats, seatsOption);
//            } else if (!verifyClassEconomicStatus(seats)) {
//                System.out.println("Vip is full!");
//                System.out.println("We have seats on the economic class!");
//
//            } else {
//                System.out.println("\"Next flight leaves in 3 hours.\"\n");
//            }
//
////            if (!verifyClassEconomicStatus(seats) && verifySeatStatus(seats, seatsOption)) {
////                assignSeat(classOption, seats, seatsOption);
////            } else if (!verifyClassVipStatus(seats)) {
////                System.out.println("We have seats on the vip class!");
////                showSeatAvaiableClassEconomic(seats);
////                System.out.println("Enter a new seat on the vip class: ");
////                seatsOption = fixSeatOptionEconomic(seats, input);
////                assignSeat(classOption, seats, seatsOption);
////            } else {
////                System.out.println("\"Next flight leaves in 3 hours.\"\n");
////            }
//
//            displaySeatStatus(seats);
//
//            System.out.println("Want finish the booking?");
//            System.out.println("Enter 1 to yes:");
//            System.out.println("Enter 2 to no:");
//            int finishOption = input.nextInt();
//
//            if (verifyFinishOption(finishOption)) {
//                finishOption = fixFinishOption(finishOption, input);
//            }
//
//            if (finishOption == 1) {
//                break;
//            }
//        }
//
//        System.out.println("\t--- Seats Status ---");
//        displaySeatStatus(seats);
    }

    public static void initiateSeats(SetSeatStatus[] seats) {
        for (int i = 0; i < seats.length; i++) {
            seats[i] = SetSeatStatus.FALSE;
        }
    }

    public static void displaySeatStatus(SetSeatStatus[] seat) {
        System.out.println("\t--- Seats Status ---");
        for (int i = 0; i < seat.length; i++) {
            System.out.printf("Seat %d: %s ", (i + 1), seat[i]);

            if (i % 2 == 1) { // controla quanto quebrar a linha
                System.out.println();
            }
        }
    }

    public static int getClassType(Scanner input) {
        System.out.println("Enter with the type of classe");
        System.out.println("1 - Is for VIP class: (1-5)");
        System.out.println("2 - Is for Economic class: (1-5)");

        int classOption = input.nextInt();

        if (!isValidClass(classOption)) {
            System.out.println("Enter the type of class again:");
            System.out.println("1 - Is for VIP class: (1-5)");
            System.out.println("2 - Is for Economic class: (1-5)");
            classOption = input.nextInt();
        }

        return classOption;
    }

    public static boolean isValidClass(int classOption) {
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

    public static void showSeatAvaiableClassVip(SetSeatStatus[] seats) {
        int vipLimitSeat = seats.length / 2;

        System.out.println("Avaiable seats on VIP class:");
        for (int i = 0; i < vipLimitSeat; i++) {
            System.out.printf("Seat %d: %s ", (i + 1), seats[i]);

            if (i % 2 == 1) { // controla quanto quebrar a linha
                System.out.println();
            }
        }
    }

    public static void showSeatAvaiableClassEconomic(SetSeatStatus[] seats) {
        int economicFirstSeat = seats.length / 2 + 1;

        System.out.println("Avaiable seats on Economic class:");
        for (int i = economicFirstSeat; i < seats.length; i++) {
            System.out.printf("Seat %d: %s ", (i + 1), seats[i]);

            if (i % 2 == 1) { // controla quanto quebrar a linha
                System.out.println();
            }
        }
    }


    public static boolean verifySeatsOption(int seatOption, int classOption, SetSeatStatus[] seats) {
        if (classOption == 1) {
            return seatOption - 1 >= 0 && seatOption - 1 <= (seats.length / 2) - 1;
        }

        return seatOption - 1 >= seats.length / 2 && seatOption - 1 <= seats.length;
    }

    public static int fixSeatOptionVip(SetSeatStatus[] seats, Scanner input) {
        int firstVipSeat = 0 + 1;
        int lastVipSeat = seats.length / 2;
        int temporarySeatOption = 0;

        System.out.println("Enter with a number seat between " + firstVipSeat + " until " + lastVipSeat);
        temporarySeatOption = input.nextInt();

        return temporarySeatOption;
    }

    public static int fixSeatOptionEconomic(SetSeatStatus[] seats, Scanner input) {
        int firstEconomicSeat = (seats.length / 2) + 1;
        int lastEconomicSeat = seats.length + 1;
        int temporarySeatOption = 0;

        System.out.println("Enter with a number seat between " + firstEconomicSeat + " until " + lastEconomicSeat);
        temporarySeatOption = input.nextInt();

        return temporarySeatOption;
    }

    public static boolean verifyClassVipStatus(SetSeatStatus[] seats) {
        int firstVipSeat = 0;
        int lastVipSeat = seats.length / 2;

        for (int i = firstVipSeat; i < lastVipSeat; i++) {
            if (seats[i] == SetSeatStatus.FALSE) {
                return false;
            }
        }
        return true;
    }

    public static boolean verifyClassEconomicStatus(SetSeatStatus[] seats) {
        int firstEconomicSeat = (seats.length / 2);
        int lastEconomicSeat = seats.length + 1;

        for (int i = firstEconomicSeat; i < lastEconomicSeat; i++) {
            if (seats[i] == SetSeatStatus.FALSE) {
                return false;
            }
        }
        return true;
    }

    public static boolean verifySeatStatus(SetSeatStatus[] seats, int seatsOption) {
        return seats[seatsOption - 1] == SetSeatStatus.FALSE;
    }

    public static void assignSeat(int classOption, SetSeatStatus[] seats, int seatNumber) {
        seats[seatNumber - 1] = SetSeatStatus.TRUE;
    }

    public static void showSeatStatusError(int classOption) {
        System.out.println("This seat " + classOption + " is booked!");
    }

    public static boolean keepingReservation(Scanner input) {
        System.out.println("Want finish the booking?");
        System.out.println("Enter 1 to yes:");
        System.out.println("Enter 2 to no:");
        int finishOption = input.nextInt();

        while (!isValidFinishOption(finishOption)) {
            System.out.println("this option " + finishOption + " it's not allowed.");
            System.out.println("Enter the number again.");
            finishOption = input.nextInt();
        }

        if (finishOption == 1) {
            return true;
        }

        return false;
    }

    public static boolean isValidFinishOption(int finishOption) {
        return finishOption == 1 || finishOption == 2;
    }
}
