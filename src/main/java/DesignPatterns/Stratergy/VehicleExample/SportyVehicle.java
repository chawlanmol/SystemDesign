package DesignPatterns.Stratergy.VehicleExample;

import DesignPatterns.Stratergy.VehicleExample.DriveStratergy.DriveStratergy;

public class SportyVehicle extends Vehicle {

    public SportyVehicle(DriveStratergy stratergy) {
        super(stratergy);
    }

}
