package models;

public class cat {
    private String name;
    private int age;
    private int hunger;
    private int mood;
    private int health;
    private int average;

    private static final int DEFAULT = 50;

    public cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.hunger = DEFAULT;
        this.mood = DEFAULT;
        this.health = DEFAULT;
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

    @Override
    public String toString() {
        return String.format("%-5s |, %s |, %s |, %s |, %s |", name, age, hunger, mood, health, average);
    }
}
