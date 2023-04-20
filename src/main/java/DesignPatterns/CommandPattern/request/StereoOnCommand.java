package DesignPatterns.CommandPattern.request;

import DesignPatterns.CommandPattern.Stereo;

public class StereoOnCommand implements ICommand{

    private Stereo stereo;
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
    }
}
