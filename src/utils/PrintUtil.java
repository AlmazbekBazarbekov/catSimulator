package utils;

import models.Cat;

import java.util.List;

public class PrintUtil {
    public static void printCat(Cat cat, int id) {
        String name = cat.getName();
        int age = cat.getAge();
        int hunger = cat.getHunger();
        int mood = cat.getMood();
        int health = cat.getHealth();
        int average = cat.getAverage();
        System.out.printf("| %-3d | %-5s | %-8d | %-7d | %-10d | %-8d | %-13d | %n", id, name, age, hunger, mood, health, average);
    }

    public static void printCats(List<Cat> cats) {
        int id = 1;
        for (Cat cat : cats) {
            printCat(cat, id);
            id++;
        }
    }
}
