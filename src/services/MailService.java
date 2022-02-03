package services;

import entities.Customer;
import enums.NotificationStatus;

public class MailService implements INotificationService{
    @Override
    public NotificationStatus notify(Customer customer) {
        return null;
    }
}
