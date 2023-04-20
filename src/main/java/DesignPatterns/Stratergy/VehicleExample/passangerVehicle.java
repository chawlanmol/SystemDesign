package DesignPatterns.Stratergy.VehicleExample;

import DesignPatterns.Stratergy.VehicleExample.DriveStratergy.DriveStratergy;

public class passangerVehicle extends Vehicle {

    public passangerVehicle(DriveStratergy stratergy) {
        super(stratergy);
    }
}
