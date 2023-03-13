package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{
    private LocalTime time;
    @Override
    public boolean hasHeadlightsTurnedOn() {
       return true;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
