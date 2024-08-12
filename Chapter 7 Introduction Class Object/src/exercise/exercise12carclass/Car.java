package exercise.exercise12carclass;

public class Car {
    private String model;
    private String year;
    private Double price;

    public Car(String model, String year, Double price) {
        this.model = model;
        this.year = year;
        if (price < 0) {
            priceLess0();
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            priceLess0();
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public void priceLess0() {
        System.out.println("The price is less than 0");
    }

    public double discount(double discountValue) {
        double discount = discountValue / 100;
        return price - (price * discount);
    }

    public void report(double discountValue){
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
        System.out.printf("Car price: %.2f%n", price);
        System.out.printf("Car discount: %.2f%n", discount(discountValue));
    }
}
