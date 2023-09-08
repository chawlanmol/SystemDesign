package Problems.ParkingLotDesing;

import Problems.ParkingLotDesing.Vechicle.Vehicle;

import java.util.Vector;

public interface IParkingLot {

    // to generate a parking ticket
    // this will occupy the parking slot
    ParkingTicket parkVehicle(Vehicle vehicle);


    // this will give parking ticket with Price
    // this will clear the parking spot
    ParkingTicket UnParkVehicle(ParkingTicket parkingTicket);

}
