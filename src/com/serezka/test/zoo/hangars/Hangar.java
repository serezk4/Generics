package com.serezka.test.zoo.hangars;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangar<T extends Animal> {
    private final List<T> animals;

    private final String name;
    private final int height;
    private final int width;

    // create hangar
    public Hangar(String name, List<T> animals) {
        this.animals = animals;
        this.name = name;

        Random random = new Random();
        this.height = random.nextInt(1000);
        this.width = random.nextInt(1000);
    }

    // get all animals
    public List<T> getAnimals() {
        return this.animals;
    }

    // get animal's names
    public List<String> getNames() {
        List<String> allNames = new ArrayList<>();
        this.animals.forEach(animal -> allNames.add(animal.getName()));

        return allNames;
    }

    // get hagar height
    public int getHeight() {
        return height;
    }

    // get hangar width
    public int getWidth() {
        return width;
    }

    // get hangar in string abstract
    @Override
    public String toString() {
        return String.format("Hangar \"%s\": %s", this.name, this.animals.toString());
    }
}
