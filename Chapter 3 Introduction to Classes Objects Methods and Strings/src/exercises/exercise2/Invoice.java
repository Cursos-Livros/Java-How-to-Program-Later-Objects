package exercises.exercise2;

class Invoice {
    private Integer number;
    private String description;
    private Integer itemQuantity;
    private Double price;

    public Invoice(Integer number, String description, Integer itemQuantity, Double price) {
        this.number = number;
        this.description = description;
        this.itemQuantity = itemQuantity;
        this.price = price;

        if (itemQuantity < 0) {
            this.itemQuantity = 0;
        }

        if (price < 0.0) {
            this.price = 0.0;
        }
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double invoiceAmmount() {
        return itemQuantity * price;
    }

}
