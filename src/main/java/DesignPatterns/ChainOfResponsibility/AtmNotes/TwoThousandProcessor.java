package DesignPatterns.ChainOfResponsibility.AtmNotes;

public class TwoThousandProcessor extends CashWithDrawProcessor {

    private Integer Notes;

    public TwoThousandProcessor(CashWithDrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(int balance) {
        Integer number = balance/2000;
        balance = balance - 2000*number;

        System.out.println("2 thousand Notes: " + number);

        if(balance != 0) {
            super.withdraw(balance);
        }
    }
}
