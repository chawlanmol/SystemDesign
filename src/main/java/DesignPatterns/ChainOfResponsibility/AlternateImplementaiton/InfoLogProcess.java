package DesignPatterns.ChainOfResponsibility.AlternateImplementaiton;

public class InfoLogProcess implements IlogProcessor{
    IlogProcessor ilogProcessor;

    public InfoLogProcess(IlogProcessor ilogProcessor) {
        this.ilogProcessor = ilogProcessor;
    }

    @Override
    public void log(int logLevel, String data) {
        if(logLevel == 1) {
            System.out.println("Info log");
        } else {
            ilogProcessor.log(logLevel , data);
        }
    }
}
