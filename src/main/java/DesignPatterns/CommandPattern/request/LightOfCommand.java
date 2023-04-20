package DesignPatterns.CommandPattern.request;

import DesignPatterns.CommandPattern.Light;

public class LightOfCommand implements ICommand {

    private Light light;
    public  LightOfCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

}
