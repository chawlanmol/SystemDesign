package DesignPatterns.CommandPattern;

import DesignPatterns.CommandPattern.request.ICommand;

public class LightRemote {

    ICommand oncommand;
    ICommand offcommand;

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
