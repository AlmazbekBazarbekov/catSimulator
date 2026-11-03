package utils;

import models.Cat;

import java.util.List;

import static java.util.Comparator.comparing;

public class catManager {
    private List<Cat> Cats;

    public catManager(List<Cat> Cats) {
        this.Cats = Cats;
    }

    public List<Cat> getCats() {
        return Cats;
    }

    public List<Cat> sortedByAverage() {
        var sorted = Cats
                .stream()
                .sorted(comparing(Cat::getAverage).reversed())
                .toList();
        return sorted;
    }

    public void createCat(String name, int age) {
        Cats.add(new Cat(name, age));
    }
}
