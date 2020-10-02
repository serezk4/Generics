package com.serezka.test.zoo;

import com.serezka.test.zoo.hangars.Hangar;

import java.util.Map;

public class Zoo {
    private final Map<Integer, ? extends Hangar> hangars;

    // create zoo
    public Zoo(Map<Integer, ? extends Hangar> hangars) {
        this.hangars = hangars;
    }

    // get zoo in string abstract
    public String getZooString() {
        StringBuilder sb = new StringBuilder();

        sb.append("All hangars:\n");
        hangars.forEach((integer, hangar) -> sb.append(String.format("Hangar #%d: %s%n", integer, hangar.toString())));

        return sb.toString();
    }
}
