package com.codecool;

public class Motorcycle extends Vehicle {
    private static int nameNumber = 1;

    Motorcycle() {
        normalSpeed = 100;
        name = "Motorcycle " + Integer.toString(nameNumber++);
    }
}
