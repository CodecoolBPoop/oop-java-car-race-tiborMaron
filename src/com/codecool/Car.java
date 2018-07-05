package com.codecool;

public class Car extends Vehicle {

    Car() {
        this.normalSpeed = Util.getRandomNumber(80, 110);
        this.name = Util.generateCarName();
    }
}
