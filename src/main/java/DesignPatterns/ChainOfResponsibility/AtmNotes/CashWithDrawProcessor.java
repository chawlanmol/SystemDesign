package DesignPatterns.ChainOfResponsibility.AtmNotes;

public class CashWithDrawProcessor {

    private CashWithDrawProcessor nextProcessor;

    public CashWithDrawProcessor(CashWithDrawProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void withdraw(int balance) {
        if(balance != 0 && nextProcessor != null) {
            nextProcessor.withdraw(balance);
        }
    }
}
