package com.codecool;

public abstract class Vehicle {
    int normalSpeed;
    String name;
    int distanceTraveled = 0;

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public String getName() {
        return name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void moveForAnHour() {
    }
}
