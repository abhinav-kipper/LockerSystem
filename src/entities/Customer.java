package entities;

public class Customer {
    private String customerName;
    private String customerId;
    private String address;
    private String emailId;
    private Long phoneNumber;

    public Customer(String customerName, String customerId, String address, String emailId, Long phoneNumber) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.address = address;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
