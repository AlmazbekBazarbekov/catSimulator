package models;

import java.util.Random;

public class Cat {
    private String name;
    private int age;
    private int hunger;
    private int mood;
    private int health;
    private int average;



    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.hunger = setRandomValue();
        this.mood = setRandomValue();
        this.health = setRandomValue();
        this.average = (hunger + mood + health) / 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    private int setRandomValue() {
        Random rand = new Random();
        return rand.nextInt(20, 80);
    }
}
