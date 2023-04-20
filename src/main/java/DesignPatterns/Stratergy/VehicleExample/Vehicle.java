package DesignPatterns.Stratergy.VehicleExample;

import DesignPatterns.Stratergy.VehicleExample.DriveStratergy.DriveStratergy;

public class Vehicle {
    private DriveStratergy driveStratergy;
    public Vehicle(DriveStratergy stratergy) {
        this.driveStratergy = stratergy;
    }
    public void Drive() {
        driveStratergy.drive();
    }
}
