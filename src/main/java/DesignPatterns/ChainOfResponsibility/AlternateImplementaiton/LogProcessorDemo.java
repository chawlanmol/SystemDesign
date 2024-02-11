package DesignPatterns.ChainOfResponsibility.AlternateImplementaiton;

public class LogProcessorDemo {

    public void Demo() {
        IlogProcessor ilogProcessor = new InfoLogProcess(new ErrorLogProcessor());
        ilogProcessor.log(2, "testing data");
    }
}
