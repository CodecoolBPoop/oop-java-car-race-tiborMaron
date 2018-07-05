package com.codecool;

public class Weather {
    private static boolean isRaining = false;

    public static void setRaining() {
        if (Util.probability(30)) isRaining = true;
    }

    public static boolean isRaining() {
        return isRaining;
    }
}
