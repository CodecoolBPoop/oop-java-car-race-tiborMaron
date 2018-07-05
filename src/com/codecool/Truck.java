package com.codecool;

public class Truck extends Vehicle {
    private int breakdownTurnsLeft = 0;

    Truck() {
        normalSpeed = 100;
        name = Integer.toString(Util.getRandomNumber(0, 1000));
    }

    @Override
    public boolean isBrokenDown() {
        return breakdownTurnsLeft != 0;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (breakdownTurnsLeft == 0) {
            if (Util.probability(5)) breakdownTurnsLeft = 2;
            else {
                if (race.isIsThereABrokenTruck()) distanceTraveled += 75;
                else distanceTraveled += normalSpeed;
            }
        } else {
            breakdownTurnsLeft--;
        }
    }
}
