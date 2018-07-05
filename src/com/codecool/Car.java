package com.codecool;

public class Car extends Vehicle {

    Car() {
        this.normalSpeed = Util.getRandomNumber(80, 110);
        this.name = Util.generateCarName();
    }

    @Override
    public boolean isBrokenDown() {
        return false;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (race.isIsThereABrokenTruck()) {
            if (normalSpeed >= 75)  distanceTraveled += 75;
            else distanceTraveled += normalSpeed;
        } else {
            distanceTraveled += normalSpeed;
        }
    }
}
