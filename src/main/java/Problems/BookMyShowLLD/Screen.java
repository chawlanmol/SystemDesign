package Problems.BookMyShowLLD;

import java.util.LinkedList;
import java.util.List;

public class Screen {
    List<Seat> seats;
    Boolean isShowRunningStatus;

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Boolean getShowRunningStatus() {
        return isShowRunningStatus;
    }

    public void setShowRunningStatus(Boolean showRunningStatus) {
        isShowRunningStatus = showRunningStatus;
    }

    public Screen() {
        isShowRunningStatus = false;
        seats = new LinkedList<>();
        for(int i = 0; i < 100; i++) {
            seats.add(new Seat(SeatStatus.AVILABLE, SeatType.PLATINUM,i));
        }
    }
}
