package com.codecool;

public class Motorcycle extends Vehicle {
    private static int nameNumber = 1;

    Motorcycle() {
        normalSpeed = 100;
        name = "Motorcycle " + Integer.toString(nameNumber++);
    }

    @Override
    public boolean isBrokenDown() {
        return false;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (Weather.isRaining()) {
            if (race.isIsThereABrokenTruck()) distanceTraveled += 75 - Util.getRandomNumber(5, 50);
            else distanceTraveled += normalSpeed  - Util.getRandomNumber(5, 50);
        }
        else {
            if (race.isIsThereABrokenTruck()) distanceTraveled += 75;
            else distanceTraveled += normalSpeed;
        }
    }
}
