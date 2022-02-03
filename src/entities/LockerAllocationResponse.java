package entities;

public class LockerAllocationResponse {
    private Integer lockerId;
    private String uniqueCode;

    public LockerAllocationResponse(Integer lockerId, String uniqueCode) {
        this.lockerId = lockerId;
        this.uniqueCode = uniqueCode;
    }

    public Integer getLockerId() {
        return lockerId;
    }

    public void setLockerId(Integer lockerId) {
        this.lockerId = lockerId;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }
}
