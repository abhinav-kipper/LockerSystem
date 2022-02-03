package services;

import java.util.Objects;

import entities.Locker;
import entities.LockerAllocationResponse;
import entities.LockerAlocationDetails;
import enums.Strategy;

public class LockerService {

    private LockerRepository lockerRepository;

    //private INotificationFactory notificationFactory; can extend
    private MailService mailService;

    private StrategyFactory strategyFactory;

    public LockerService(LockerRepository lockerRepository, MailService mailService) {
        this.lockerRepository = lockerRepository;
        this.mailService = mailService;
    }

    public LockerAllocationResponse getLocker(LockerAlocationDetails lockerAlocationDetails) throws Exception {
        Locker locker =  findLockerForPackage(lockerAlocationDetails);
        if (Objects.isNull(locker)) {
            // can have a response with status also here
            throw new Exception("Can not find Locker for the package at the moment");
        }

       mailService.notify(lockerAlocationDetails.getCustomer());
        return new LockerAllocationResponse(locker.getLockerId(), locker.getKeyToOpen());

    }
    private Locker findLockerForPackage(LockerAlocationDetails lockerAlocationDetails) {
        IAllocationStrategy strategy = strategyFactory.getStrategy(Strategy.RANDOM_ALLOCATION);
    }




    public Locker addLocker() {
        return null;
    };

    public Locker removeLocker() {
        return null;
    };

}
