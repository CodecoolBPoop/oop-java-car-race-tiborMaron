package com.codecool;

public class Truck extends Vehicle {
    int breakdownTurnsLeft = 0;

    Truck() {
        normalSpeed = 100;
        name = Integer.toString(Util.getRandomNumber(0, 1000));
    }
}
