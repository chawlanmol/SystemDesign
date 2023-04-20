package DesignPatterns.ChainOfResponsibility.AtmNotes;

public class HundredProcessor extends CashWithDrawProcessor {

    public HundredProcessor(CashWithDrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(int balance) {
        Integer number = balance/100;
        balance = balance - number*100;
        System.out.println("100 Notes Notes: " + number);

        if(balance != 0) {
            super.withdraw(balance);
        }
    }
}
