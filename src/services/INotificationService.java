package services;

import entities.Customer;
import enums.NotificationStatus;

public interface INotificationService {

    NotificationStatus notify(Customer customer);
}
