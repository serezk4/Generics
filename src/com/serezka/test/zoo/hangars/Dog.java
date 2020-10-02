package com.serezka.test.zoo.hangars;

import java.util.Random;

public class Dog extends Animal {
    private static final String[] names = new String[]{"doggy", "hip", "bage", "lis", "happy", "chocolate"};

    public Dog() {
        super(names[new Random().nextInt(names.length)]);
    }

    @Override
    public String say() {
        return "Woof! Woof!";
    }
}
