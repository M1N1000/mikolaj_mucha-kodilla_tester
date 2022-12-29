package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Butterfly", 4.4, 5.8,"Yes"));
        stamps.add(new Stamp("Car", 3.2, 6,"Yes"));
        stamps.add(new Stamp("Ball", 3.1, 6.2,"No"));
        stamps.add(new Stamp("Butterfly", 4.4, 5.8,"Yes"));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps)
            System.out.println(stamp);


    }
}
