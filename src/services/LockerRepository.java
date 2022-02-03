package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import entities.Locker;

public class LockerRepository implements IRepository {

    private static final Map<String, Locker> lockers = new HashMap<>();

    public Locker add(Locker locker) {
        lockers.put(locker.getLockerId(), locker);
        return lockers.get(locker.getLockerId());
    }

    public Locker remove(String lockerId) {
        lockers.remove(lockerId);
        return lockers.get(lockerId);
    }

    public Locker allocate(String lockerId) throws Exception {
      if (lockers.containsKey(lockerId)) {
          Locker locker = lockers.get(lockerId);
          Boolean allocated = locker.isAllocated();
          if (allocated) {
              throw new Exception(" Locker already allocated");
              // can return null depending on impl
          }
          locker.setAllocated(true);
          lockers.put(lockerId, locker);
          return locker;
      }
      return null;
    }
}
