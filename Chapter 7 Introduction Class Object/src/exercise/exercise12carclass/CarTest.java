package exercise.exercise12carclass;

import java.util.ArrayList;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<Car>();

        // Aqui usei entidades ricas
        // Entidades ricas sao classes que contem grande parte das regras de negocio
        for (int i = 0; i < 2; i++) {
            cars.add(newCar(input));
            input.nextLine();
        }

        for(Car car: cars){
            car.report(assignDiscount(input));
            input.nextLine();
        }


    }

    public static Car newCar(Scanner input) {
        System.out.println("Enter the car model:");
        String carModel = input.nextLine();

        System.out.println("Enter the car year:");
        String carYear = input.nextLine();

        System.out.println("Enter the car price:");
        Double carPrice = input.nextDouble();

        return new Car(carModel, carYear, carPrice);
    }

    public static double assignDiscount(Scanner input) {
        double discount;

        System.out.println("Enter the discount:");
        discount = input.nextDouble();

        return discount;
    }
}
