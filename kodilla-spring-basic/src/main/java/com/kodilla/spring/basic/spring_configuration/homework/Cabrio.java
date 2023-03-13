package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car{
    private LocalTime time;
    @Override
    public boolean hasHeadlightsTurnedOn() {
        if (true) {
            return Boolean.parseBoolean("Lights is On");
        }else
            System.out.println("Lights is Off");
        return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
