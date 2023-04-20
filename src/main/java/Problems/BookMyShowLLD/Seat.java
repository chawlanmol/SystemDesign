package Problems.BookMyShowLLD;

public class Seat {
    SeatStatus seatStatus;
    SeatType seatType;
    Integer seatNumber;

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Seat(SeatStatus seatStatus, SeatType seatType, Integer seatNumber) {
        this.seatStatus = seatStatus;
        this.seatType = seatType;
        this.seatNumber = seatNumber;
    }
}
