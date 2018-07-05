package com.codecool;

public abstract class Vehicle {
    int normalSpeed;
    String name;
    int distanceTraveled = 0;

    String getName() {
        return name;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    public abstract boolean isBrokenDown();

    public abstract void moveForAnHour(Race race);
}
