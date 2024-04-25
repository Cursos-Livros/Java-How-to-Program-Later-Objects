package exercises.exercise2;

class Invoice {
    private String number;
    private String description;
    private Integer itemQuantity;
    private Double price;

    public Invoice(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;

        if (itemQuantity < 0) {
            itemQuantity = 0;
        }

        if (price < 0.0) {
            price = 0.0;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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

    public Double getInvoiceMethod() {
        return itemQuantity * price;
    }
}
