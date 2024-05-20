package DesignPatterns.CommandPattern.request;

import DesignPatterns.CommandPattern.Stereo;

public class VolumeUpCommand implements ICommand {

    Stereo stereo;

    public VolumeUpCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.up();
    }


}
