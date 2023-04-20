package DesignPatterns.ChainOfResponsibility.AtmNotes;

public class AtmDemo {
    public void Demo() {
        CashWithDrawProcessor cashWithDrawProcessor = new TwoThousandProcessor(new FiveHundredProcessor(new HundredProcessor(null)));
        cashWithDrawProcessor.withdraw(5550);
    }
}
