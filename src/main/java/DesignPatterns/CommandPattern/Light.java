package DesignPatterns.CommandPattern;

import Utilities.LoggerUtil;

public class Light {

    public void on() {
        LoggerUtil.log("Light Switched on");
    }

    public void off() {
        LoggerUtil.log("Light Switched off");
    }
}
