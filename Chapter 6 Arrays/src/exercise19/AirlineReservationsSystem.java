package exercise19;

import java.util.Scanner;

public class AirlineReservationsSystem {
    private enum SetSeatStatus {TRUE, FALSE}

    public static void main(String[] args) {
        SetSeatStatus[] seats = new SetSeatStatus[10];
        run(seats);
    }

    public static void run(SetSeatStatus[] seats) {
        Scanner input = new Scanner(System.in);

        initiateSeats(seats);// inicia os assentos todos com status false
        displaySeatStatus(seats);

        //!stopBook && !verifyFullBooking(seats))

        while (!allSeatsBooked(seats)) {
            int classOption = getClassType();

            displayClassSeats(classOption);
            displaySeatAvaiable(seats, classOption);
            seats = processReservation(seats, classOption);

            if (!keepingReservation()) {
                break;
            }
        }

        input.close();
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

    public static boolean allSeatsBooked(SetSeatStatus[] seats) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == SetSeatStatus.FALSE) {
                return false;
            }
        }
        System.out.println("Next flight leaves in 3 hours");
        return true;
    }

    public static int getClassType() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter with the type of classe");
        System.out.println("1 - Is for VIP class: (1-5)");
        System.out.println("2 - Is for Economic class: (6-10)");

        int classOption = input.nextInt();

        if (!isValidClass(classOption)) {
            System.out.println("Enter the type of class again:");
            System.out.println("1 - Is for VIP class: (1-5)");
            System.out.println("2 - Is for Economic class: (6-10)");
            classOption = input.nextInt();
        }

        return classOption;
    }

    public static boolean isValidClass(int classOption) {
        return classOption == 1 || classOption == 2;
    }

    public static void displayClassSeats(int classOption) {
        switch (classOption) {
            case 1:
                System.out.println("The choose class is VIP;");
                break;
            case 2:
                System.out.println("The choose class is Economic;");
                break;
        }
    }

    public static void displaySeatAvaiable(SetSeatStatus[] seats, int classOption) {
        if (classOption == 1) {
            int vipLimitSeat = seats.length / 2;

            System.out.println();
            System.out.println("Avaiable seats on VIP class:");
            for (int i = 0; i < vipLimitSeat; i++) {
                System.out.printf("Seat %d: %s ", (i + 1), seats[i]);

                if (i % 2 == 1) { // controla quanto quebrar a linha
                    System.out.println();
                }
            }
        }

        if (classOption == 2) {
            int firstEconomicSeat = seats.length / 2;

            System.out.println("Avaiable seats on Economic class:");
            for (int i = firstEconomicSeat; i < seats.length; i++) {
                System.out.printf("Seat %d: %s ", (i + 1), seats[i]);

                if (i % 2 == 1) { // controla quanto quebrar a linha
                    System.out.println();
                }
            }
        }
    }

    public static SetSeatStatus[] processReservation(SetSeatStatus[] seats, int classOption) {
        Scanner input = new Scanner(System.in);
        SetSeatStatus[] temporarySeat = seats;

        if (classOption == 1) {
            if (!vipClassFull(seats)) {
                assignSeat(seats, classOption);
            } else if (!vipClassFull(seats)) {
                int changeClassOption = changeClass(classOption);
                assignSeat(seats, changeClassOption);
            } else {
                System.out.println("Next flight lef in 3 hours!");
            }

        }

        if (classOption == 2) {
            if (!economicClassFull(seats)) {
                assignSeat(seats, classOption);
            } else if (!vipClassFull(seats)) {
                int changeClassOption = changeClass(classOption);
                if (changeClassOption == 0) {
                    return temporarySeat;
                }
                assignSeat(seats, changeClassOption);
            } else {
                System.out.println("Next flight lef in 3 hours!");
            }
        }

        return temporarySeat;
    }

    public static int changeClass(int classOption) {
        Scanner input = new Scanner(System.in);
        int classChange = 0;

        if (classOption == 1) {
            System.out.println("Wish change to economic class:");
            System.out.println("Enter 1 to yes:");
            System.out.println("Enter 2 to no:");
            classChange = input.nextInt();
        }

        if (classOption == 2) {
            System.out.println("Wish change to vip class:");
            System.out.println("Enter 1 to yes:");
            System.out.println("Enter 2 to no:");
            classChange = input.nextInt();
        }

        while (!isValidClass(classChange)) {
            classChange = input.nextInt();
        }

        if (classOption == 1 && classChange == 1) {
            return 2;
        }
        if (classOption == 2 && classChange == 1) {
            return 1;
        }

        return 0;
    }

    public static boolean vipClassFull(SetSeatStatus[] seats) {
        int firstVipSeat = 0;
        int lastVipSeat = seats.length / 2;

        for (int i = firstVipSeat; i < lastVipSeat; i++) {
            if (seats[i] == SetSeatStatus.FALSE) {
                return false;
            }
        }
        return true;
    }

    public static boolean economicClassFull(SetSeatStatus[] seats) {
        int firstVipSeat = seats.length / 2;


        for (int i = firstVipSeat; i < seats.length; i++) {
            if (seats[i] == SetSeatStatus.FALSE) {
                return false;
            }
        }
        return true;
    }

    public static SetSeatStatus[] assignSeat(SetSeatStatus[] seats, int classOption) {
        Scanner input = new Scanner(System.in);
        int seat = 0;

        if (classOption == 1) {
            seat = input.nextInt();

            while (!validateSeatForClass(classOption, seat, seats)) {
                System.out.println("This seat" + seat + "it's not in that class!");
                seat = input.nextInt();
            }

            if (!checkSeatStatus(seats, seat)) {
                seat = handleSeatReservation(seats, seat);
                seats[seat - 1] = SetSeatStatus.TRUE;
            } else {
                seats[seat - 1] = SetSeatStatus.TRUE;
            }
        }

        if (classOption == 2) {
            System.out.println("Choose a seat number:");
            seat = input.nextInt();

            while (!validateSeatForClass(classOption, seat, seats)) {
                System.out.println("This seat" + seat + "it's not in that class!");
                seat = input.nextInt();
            }

            if (!checkSeatStatus(seats, seat)) {
                seat = handleSeatReservation(seats, seat);
                seats[seat - 1] = SetSeatStatus.TRUE;
            } else {
                seats[seat - 1] = SetSeatStatus.TRUE;
            }
        }

        return seats;
    }

    public static int handleSeatReservation(SetSeatStatus[] seats, int seat) {
        Scanner input = new Scanner(System.in);

        while (!checkSeatStatus(seats, seat)) {
            System.out.println("This seat is booked!");
            System.out.println("enter a new seat:");
            seat = input.nextInt();
        }

        return seat;
    }

    public static boolean validateSeatForClass(int classOption, int seat, SetSeatStatus[] seats) {
        if (classOption == 1) {
            int lastVipSeat = seats.length / 2;
            return seat - 1 >= 0 && seat - 1 < lastVipSeat;
        }

        int firstEconomicSeat = seats.length / 2;
        return seat - 1 >= firstEconomicSeat && seat - 1 < seats.length;
    }

    public static boolean checkSeatStatus(SetSeatStatus[] seats, int seat) {
        return seats[seat - 1] == SetSeatStatus.FALSE;
    }

    public static boolean keepingReservation() {
        Scanner input = new Scanner(System.in);

        System.out.println();

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
            return false;
        }

        return true;
    }

    public static boolean isValidFinishOption(int finishOption) {
        return finishOption == 1 || finishOption == 2;
    }


}
