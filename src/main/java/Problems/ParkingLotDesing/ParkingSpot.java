package Problems.ParkingLotDesing;

import Problems.ParkingLotDesing.Vechicle.Vehicle;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class ParkingSpot {

    Vehicle vehicle;

    int parkingSpotID;

    Boolean isOccupied;

}
