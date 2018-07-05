package com.codecool;

class Weather {
    private static boolean isRaining = false;

    static void setRaining() {
        isRaining = Util.probability(30);
    }

    static boolean isRaining() {
        return isRaining;
    }
}
