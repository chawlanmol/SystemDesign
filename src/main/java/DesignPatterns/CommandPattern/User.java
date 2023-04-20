package DesignPatterns.CommandPattern;

import DesignPatterns.CommandPattern.request.LightOfCommand;
import DesignPatterns.CommandPattern.request.LightOnCommand;
import DesignPatterns.CommandPattern.request.StereoOffCommand;
import DesignPatterns.CommandPattern.request.StereoOnCommand;

public class User {

    public void Demo() {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOfCommand lightOfCommand = new LightOfCommand(light);
        LightRemote lightRemote = new LightRemote(lightOnCommand , lightOfCommand);
        lightRemote.buttonWasPressed();
        lightRemote.buttonWasReleased();




        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        StereoRemote stereoRemote = new StereoRemote(stereoOnCommand, stereoOffCommand, stereoOffCommand, stereoOffCommand);

        stereoRemote.onButtonPressed();
        stereoRemote.offButtonPressed();
        stereoRemote.dowmButtonPressed();

    }
}
