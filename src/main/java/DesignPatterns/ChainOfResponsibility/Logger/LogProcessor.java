package DesignPatterns.ChainOfResponsibility.Logger;

public class LogProcessor {

    LogProcessor nextLogProcessor;
    public static Integer Info = 1;
    public static Integer DEBUG = 2;
    public static Integer Error = 3;

    public LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void log(int logLevel, String message) {

        if(nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }

}