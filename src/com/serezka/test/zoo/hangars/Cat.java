package com.serezka.test.zoo.hangars;

import java.util.Random;

public class Cat extends Animal {
    private static final String[] names = new String[]{"kitty", "tishka", "choco", "barsik"};

    public Cat() {
        super(names[new Random().nextInt(names.length)]);
    }

    @Override
    public String say() {
        return "Woof! Woof!";
    }
}

