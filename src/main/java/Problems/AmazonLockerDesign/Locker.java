package Problems.AmazonLockerDesign;

public class Locker {
    private Integer LockerID;
    private Boolean isVacant;
    private LockerSize lockerSize;

    public Integer getLockerID() {
        return LockerID;
    }

    public Locker(LockerSize lockerSize) {
        this.isVacant = false;
        this.lockerSize = lockerSize;
    }

    public LockerSize getLockerSize() {
        return lockerSize;
    }

    public void setLockerSize(LockerSize lockerSize) {
        this.lockerSize = lockerSize;
    }

    public void setLockerID(Integer lockerID) {
        LockerID = lockerID;
    }

    public Boolean getVacant() {
        return isVacant;
    }

    public void setVacant(Boolean vacant) {
        isVacant = vacant;
    }
}
