package DesignPatterns.ChainOfResponsibility.Logger;

public class LoggerDemo {

    public void Demo() {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(1, "this is info log");
        logProcessor.log(2, "this is debug log");
        logProcessor.log(3, "this is error log");

    }
}
