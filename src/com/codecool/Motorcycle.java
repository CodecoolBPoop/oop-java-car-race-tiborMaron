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
            int newSpeed = normalSpeed - Util.getRandomNumber(5, 50);
            if (race.isThereABrokenTruck()) {
                if (newSpeed >= 75) distanceTraveled += 75;
                else distanceTraveled += newSpeed;
            }
            else distanceTraveled += newSpeed;
        }
        else {
            if (race.isThereABrokenTruck()) distanceTraveled += 75;
            else distanceTraveled += normalSpeed;
        }
    }
}
