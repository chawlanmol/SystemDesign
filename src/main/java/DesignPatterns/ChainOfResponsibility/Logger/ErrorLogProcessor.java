package DesignPatterns.ChainOfResponsibility.Logger;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == Error) {
            System.out.println(message);
        } else {
            super.log(logLevel, message);
        }
    }
}
