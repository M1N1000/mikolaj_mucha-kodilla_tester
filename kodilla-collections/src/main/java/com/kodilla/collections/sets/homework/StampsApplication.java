package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Butterfly", 4.4, 5.8,true));
        stamps.add(new Stamp("Car", 3.2, 6,true));
        stamps.add(new Stamp("Ball", 3.1, 6.2,false));
        stamps.add(new Stamp("Butterfly", 4.4, 5.8,true));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps)
            System.out.println(stamp);


    }
}
