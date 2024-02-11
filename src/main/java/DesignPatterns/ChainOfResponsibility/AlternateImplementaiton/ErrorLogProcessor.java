package DesignPatterns.ChainOfResponsibility.AlternateImplementaiton;

public class ErrorLogProcessor implements IlogProcessor {

    IlogProcessor ilogProcessor;

    public ErrorLogProcessor(IlogProcessor ilogProcessor) {
        this.ilogProcessor = ilogProcessor;
    }

    public ErrorLogProcessor() {
        this.ilogProcessor = ilogProcessor;
    }
    @Override
    public void log(int logLevel, String data) {
        if(logLevel == 2) {
            System.out.println("error log");
        } else {
            ilogProcessor.log(logLevel, data);
        }
    }
}
