package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car{

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
        return "Sedan";
    }
}
