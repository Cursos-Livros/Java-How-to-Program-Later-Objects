package exercise.exercise9enumFood;

public class FoodTest {
    public static void main(String[] args) {
        System.out.println("All foods:");

        // print all books in enum Book
        for(Food food: Food.values()){
            System.out.printf("%-10s%-15s%s%n", food, food.getType(), food.getCalories());
        }
    }
}
