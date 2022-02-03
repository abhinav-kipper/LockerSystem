package services;

import enums.Strategy;

public class StrategyFactory {


    RandomAllocationStrategy randomAllocationStrategy;



    public IAllocationStrategy getStrategy(Strategy strategy) {
        switch(strategy) {
            case RANDOM_ALLOCATION:
                return randomAllocationStrategy;
        }
        return null;
    }
}
