package com.codecool;

class Weather {
    private static boolean isRaining = false;

    static void setRaining() {
        if (Util.probability(30)) isRaining = true;
    }

    static boolean isRaining() {
        return isRaining;
    }
}
