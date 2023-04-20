package DesignPatterns.ChainOfResponsibility.Logger;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == Info) {
            System.out.println(message);
        } else {
            super.log(logLevel, message);
        }
    }


}
