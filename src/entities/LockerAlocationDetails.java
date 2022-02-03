package entities;

import enums.NotificationMode;

public class LockerAlocationDetails {
    private Customer customer;
    private Package aPackage;
    private NotificationMode notificationMode;

    public LockerAlocationDetails(Customer customer, Package aPackage) {
        this.customer = customer;
        this.aPackage = aPackage;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
