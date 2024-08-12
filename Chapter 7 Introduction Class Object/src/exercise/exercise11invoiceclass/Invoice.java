package exercise.exercise11invoiceclass;

public class Invoice {
    private Integer number;
    private String description;
    private Integer quantityItem;
    private Double priceItem;

    public Invoice(int number, String description, int quantityItem, double priceItem) {
        this.number = number;
        this.description = description;
        if (quantityItem > 0) {
            this.quantityItem = quantityItem;
        } else {
            this.quantityItem = 0;
        }
        if (priceItem > 0) {
            this.priceItem = priceItem;
        } else {
            this.priceItem = 0.0;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public void setQuantityItem(int quantityItem) {
        this.quantityItem = quantityItem;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public Double getInvoiceAmmouunt() {
        return quantityItem * priceItem;
    }

    public void invoiceToString() {
        System.out.printf("Item number: %d%n", number);
        System.out.printf("Item description: %s%n", description);
        System.out.printf("Item quantity: %d%n", quantityItem);
        System.out.printf("Item price: %.2f%n", priceItem);
        System.out.printf("Total item: %.2f%n", getInvoiceAmmouunt());
    }
}
