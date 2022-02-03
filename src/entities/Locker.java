package entities;

public class Locker {
    private String lockerId;
    private Long lockerSize;
    private String lockerLocation;
    private  Boolean isAllocated = false;
    private String keyToOpen;


    public Locker(String lockerId, Long lockerSize, String lockerLocation, Boolean isAllocated, String keyToOpen) {
        this.lockerId = lockerId;
        this.lockerSize = lockerSize;
        this.lockerLocation = lockerLocation;
        this.isAllocated = isAllocated;
        this.keyToOpen = keyToOpen;
    }

    public String getKeyToOpen() {
        return keyToOpen;
    }



    public String getLockerId() {
        return lockerId;
    }

    public void setLockerId(String lockerId) {
        this.lockerId = lockerId;
    }

    public Long getLockerSize() {
        return lockerSize;
    }

    public void setLockerSize(Long lockerSize) {
        this.lockerSize = lockerSize;
    }

    public String getLockerLocation() {
        return lockerLocation;
    }

    public void setLockerLocation(String lockerLocation) {
        this.lockerLocation = lockerLocation;
    }

    public Boolean isAllocated() {
        return isAllocated;
    }

    public void setAllocated(Boolean allocated) {
        isAllocated = allocated;
    }
}
