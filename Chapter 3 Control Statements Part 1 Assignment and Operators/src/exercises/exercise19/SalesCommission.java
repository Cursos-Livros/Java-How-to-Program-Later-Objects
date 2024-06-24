package exercises.exercise19;

public class SalesCommission {
    private Integer salesPersonId;
    private Double totalItemValue;

    public SalesCommission(Integer salesPersonId, Double totalItemValue) {
        this.salesPersonId = salesPersonId;
        this.totalItemValue = totalItemValue;
    }

    public Integer getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(Integer salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public Double getTotalItemValue() {
        return totalItemValue;
    }

    public void setTotalItemValue(Double totalItemValue) {
        this.totalItemValue = totalItemValue;
    }

    public Double weekSalary(){
        return (totalItemValue * 0.09) + 200;
    }
}
