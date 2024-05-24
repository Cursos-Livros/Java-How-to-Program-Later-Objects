package exercises.exercise18;

public class CreditLimit {
    private Integer accountNumber;
    private Double balanceBeginMonth;
    private Double totalItemCharged;
    private Double creditSpend;
    private Double totalCredit;

    public CreditLimit(Integer accountNumber, Double balanceBeginMonth, Double totalItemCharged, Double creditSpend, Double totalCredit) {
        this.accountNumber = accountNumber;
        this.balanceBeginMonth = balanceBeginMonth;
        this.totalItemCharged = totalItemCharged;
        this.creditSpend = creditSpend;
        this.totalCredit = totalCredit;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalanceBeginMonth() {
        return balanceBeginMonth;
    }

    public void setBalanceBeginMonth(Double balanceBeginMonth) {
        this.balanceBeginMonth = balanceBeginMonth;
    }

    public Double gettotalItemCharged() {
        return totalItemCharged;
    }

    public void settotalItemCharged(Double totalItemCharged) {
        this.totalItemCharged = totalItemCharged;
    }

    public Double getCreditSpend() {
        return creditSpend;
    }

    public void setCreditSpend(Double creditSpend) {
        this.creditSpend = creditSpend;
    }

    public Double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Double totalCredit) {
        this.totalCredit = totalCredit;
    }

    public String newBalance() {
        double newBalance =   (balanceBeginMonth + totalItemCharged) - creditSpend;
        if (newBalance > totalCredit) {
            return "Credit limit exceeded";
        } else {
            return "The new Balance is: " + newBalance;
        }
    }
}
