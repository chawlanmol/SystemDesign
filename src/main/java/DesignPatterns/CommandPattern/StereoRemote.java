package DesignPatterns.CommandPattern;

import DesignPatterns.CommandPattern.request.ICommand;
import Utilities.LoggerUtil;

public class StereoRemote {
    ICommand on;
    ICommand off;
    ICommand up;
    ICommand down;

    public StereoRemote(ICommand on, ICommand off , ICommand up, ICommand down) {
        this.on = on;
        this.down = down;
        this.off = off;
        this.up = up;
    }

    public void onButtonPressed(){
        LoggerUtil.log("ON button pressed");
        on.execute();
    }

    public void offButtonPressed(){
        LoggerUtil.log("off button pressed");
        off.execute();
    }
    public void upButtonPressed(){
        LoggerUtil.log("UP button pressed");
        up.execute();
    }
    public void dowmButtonPressed(){
        LoggerUtil.log("Dowm button pressed");
        down.execute();
    }
}
