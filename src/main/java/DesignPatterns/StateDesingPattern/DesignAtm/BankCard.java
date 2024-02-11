package DesignPatterns.StateDesingPattern.DesignAtm;

public class BankCard {

    private Integer cardNumber;
    private Integer cvv;
    private BankingDetails bankingDetails;

    public BankingDetails getBankingDetails() {
        return bankingDetails;
    }

    public void setBankingDetails(BankingDetails bankingDetails) {
        this.bankingDetails = bankingDetails;
    }
}
