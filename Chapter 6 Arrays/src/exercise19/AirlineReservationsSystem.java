package exercise19;

public class AirlineReservationsSystem {
    private enum SetSeatStatus {TRUE, FALSE}

    public static void main(String[] args) {
        SetSeatStatus[] seats = new SetSeatStatus[10];

        initiateSeats(seats); // inicia os assentos todos com status false

        System.out.println("\t--- Seats Status ---");
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
}
