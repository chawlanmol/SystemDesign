package DesignPatterns.Stratergy.VehicleExample.DriveStratergy;

import Utilities.LoggerUtil;

public class NormalDrive implements DriveStratergy {
    public void drive() {
        LoggerUtil.log("this is normal Drive");
    }
}
