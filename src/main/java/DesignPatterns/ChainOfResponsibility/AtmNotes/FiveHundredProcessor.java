package DesignPatterns.ChainOfResponsibility.AtmNotes;

public class FiveHundredProcessor extends CashWithDrawProcessor {
    public FiveHundredProcessor(CashWithDrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(int balance) {
        Integer number = balance/500;
        balance = balance - number*500;
        System.out.println("5 hundred Notes: " + number);
        if(balance != 0) {
            super.withdraw(balance);
        }
    }
}
