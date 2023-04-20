package DesignPatterns.Stratergy.VehicleExample;

import DesignPatterns.Stratergy.VehicleExample.DriveStratergy.DriveStratergy;
import DesignPatterns.Stratergy.VehicleExample.DriveStratergy.NormalDrive;
import DesignPatterns.Stratergy.VehicleExample.DriveStratergy.SportyDrive;

public class VehicleDemo {

    public void Demo() {
        DriveStratergy driveStratergy = new SportyDrive();
        SportyVehicle sportyVehicle = new SportyVehicle(driveStratergy);
        sportyVehicle.Drive();
        driveStratergy = new NormalDrive();
        sportyVehicle = new SportyVehicle(driveStratergy);
        sportyVehicle.Drive();

    }
}
