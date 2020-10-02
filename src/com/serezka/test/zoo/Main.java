package com.serezka.test.zoo;

import com.serezka.test.zoo.hangars.Cat;
import com.serezka.test.zoo.hangars.Dog;
import com.serezka.test.zoo.hangars.Hangar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        Hangar<Dog> dogsHangar = new Hangar<>("dogs!!!", dogs);
        Hangar<Cat> catsHangar = new Hangar<>("cat's paradise", cats);

        Map<Integer, Hangar> zooFill = new HashMap<>();
        zooFill.put(1, dogsHangar);
        zooFill.put(2, catsHangar);

        Zoo zoo = new Zoo(zooFill);
        System.out.println(zoo.getZooString());
    }
}
