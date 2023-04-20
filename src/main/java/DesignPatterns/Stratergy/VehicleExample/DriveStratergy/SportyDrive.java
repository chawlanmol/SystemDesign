package DesignPatterns.Stratergy.VehicleExample.DriveStratergy;

import Utilities.LoggerUtil;

public class SportyDrive implements DriveStratergy {
    public void drive() {
        LoggerUtil.log("this is sporty Drive");
    }
}
