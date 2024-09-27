package exercise.exercise9enumFood;

public enum Food {
    APPLE("Fruit", 52),

    BANANA("Fruit", 89),

    CARROT("Vegetable", 41);

    private final String type;
    private final Integer calories;

    Food(String type, Integer calories) {
        this.type = type;
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public Integer getCalories() {
        return calories;
    }
}
