package DesignPatterns.CommandPattern;

import Utilities.LoggerUtil;

public class Stereo {

    public void on() {
        LoggerUtil.log("Stereo is on");
    }

    public void off() {
        LoggerUtil.log("Stereo is off");
    }

    public void up() {
        LoggerUtil.log("Stereo volume up");
    }

    public void Down() {
        LoggerUtil.log("Stereo volume Down");
    }
}
