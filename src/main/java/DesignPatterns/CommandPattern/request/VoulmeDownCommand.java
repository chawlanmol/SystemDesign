package DesignPatterns.CommandPattern.request;

import DesignPatterns.CommandPattern.Stereo;

public class VoulmeDownCommand implements ICommand {

    Stereo stereo;

    public VoulmeDownCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.Down();
    }
}
