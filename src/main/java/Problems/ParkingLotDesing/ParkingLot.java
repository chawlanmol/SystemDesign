package Problems.ParkingLotDesing;

import Problems.ParkingLotDesing.Vechicle.Vehicle;

import java.util.List;

public class ParkingLot implements IParkingLot{
    String name;

    String Address;

    List<ParkingFloor> parkingFloorList;

    Boolean isFull;

    @Override
    public ParkingTicket parkVehicle(Vehicle vehicle) {
        ParkingFloor parkingFloor = getEmptyParkingFloor(this.parkingFloorList);
        ParkingSpot parkingSpot = getEmptyParkingSpot(parkingFloor);
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setIsOccupied(Boolean.TRUE);
        ParkingTicket parkingTicket = new ParkingTicket(parkingSpot);
        return parkingTicket;
    }

    @Override
    public ParkingTicket UnParkVehicle(ParkingTicket parkingTicket) {
        return null;
    }

    private ParkingFloor getEmptyParkingFloor(List<ParkingFloor> parkingFloorList) {

        return null;
    }

    private ParkingSpot getEmptyParkingSpot(ParkingFloor parkingFloor) {
        return null;
    }
}
