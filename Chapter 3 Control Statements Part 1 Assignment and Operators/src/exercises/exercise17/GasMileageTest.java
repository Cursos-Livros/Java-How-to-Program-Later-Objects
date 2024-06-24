package exercises.exercise17;

import java.util.Locale;
import java.util.Scanner;

public class GasMileageTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double totalKm = 0;
        double totalGas = 0;

        while (true) {

            System.out.println("Enter the quantity of trips:");
            int quantityTrip = input.nextInt();

            if (quantityTrip == -1) {
                break;
            }

            System.out.println("Enter the km driven( enter -1 to quit):");
            int kmTraveled = input.nextInt();

            System.out.println("Enter the gas consumed in this travel");
            int quantityLiter = input.nextInt();

            GasMileage gasMileage = new GasMileage(kmTraveled, quantityLiter);

            System.out.printf("Kiometer per litter for this trip: %.2f\n", gasMileage.kmPerLiter());

            totalKm += gasMileage.getKmdrive();
            totalKm += gasMileage.getUsedLitter();

        }

        input.close();


    }
}
