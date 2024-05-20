package DesignPatterns.CommandPattern;

import DesignPatterns.CommandPattern.request.ICommand;

public class LightRemote {

    ICommand oncommand;
    ICommand offcommand;

    ICommand volumeUpCommand;

    ICommand volumeDownCommand;

    public LightRemote(ICommand oncommand , ICommand offcommand) {
        this.oncommand = oncommand;
        this.offcommand = offcommand;
    }
    public void buttonWasPressed() {
        oncommand.execute();
    }

    public void buttonWasReleased () {
        offcommand.execute();
    }


}
