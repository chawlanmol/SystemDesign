package DesignPatterns.CommandPattern;

import DesignPatterns.CommandPattern.request.LightOfCommand;
import DesignPatterns.CommandPattern.request.LightOnCommand;
import DesignPatterns.CommandPattern.request.StereoOffCommand;
import DesignPatterns.CommandPattern.request.StereoOnCommand;
import DesignPatterns.CommandPattern.request.VolumeUpCommand;
import DesignPatterns.CommandPattern.request.VoulmeDownCommand;

public class User {

    public void Demo() {

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        VoulmeDownCommand voulmeDownCommand = new VoulmeDownCommand(stereo);
        VolumeUpCommand volumeUpCommand = new VolumeUpCommand(stereo);

        StereoRemote stereoRemote = new StereoRemote(stereoOnCommand, stereoOffCommand, volumeUpCommand, voulmeDownCommand);

        stereoRemote.onButtonPressed();
        stereoRemote.offButtonPressed();
        stereoRemote.dowmButtonPressed();
        stereoRemote.upButtonPressed();
    }
}
