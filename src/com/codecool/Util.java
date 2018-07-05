package com.codecool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Util {
    private static Random random = new Random();
    private static List<String> names = new ArrayList<>();

    static {
        // Reads the file
        String file = "resources/names.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getRandomNumber(int from, int to) {
        return random.nextInt(to - from + 1) + from;
    }

    public static String generateCarName() {
        int firstNameIndex = random.nextInt(names.size());
        int lastNameIndex = random.nextInt(names.size());
        return names.get(firstNameIndex) + " " + names.get(lastNameIndex);
    }

    public static boolean probability(int percent) {
        int randomNumber = getRandomNumber(1, 100);
        return randomNumber <= percent;
    }
}
