package exercises;

public class GasMileage {
    private Integer kmDriven;
    private Integer gas;

    private Double tripQuantity;

    public GasMileage(Integer kmDriven, Integer gas) {
        this.kmDriven = kmDriven;
        this.gas = gas;
    }

    public Integer getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(Integer kmDriven) {
        this.kmDriven = kmDriven;
    }

    public Integer getGas() {
        return gas;
    }

    public void setGas(Integer gas) {
        this.gas = gas;
    }

    public double kmGas() {
        return (double) kmDriven / gas;
    }

    public Double consumeAverage() {
        double average = 0;
        int i = 0;
        while (i < tripQuantity) {
            average += kmGas();
            i++;
        }
        return average / i;
    }
}
