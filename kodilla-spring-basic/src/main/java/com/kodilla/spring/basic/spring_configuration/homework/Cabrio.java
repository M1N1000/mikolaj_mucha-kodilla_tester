package com.kodilla.spring.basic.spring_configuration.homework;

import java.util.Random;

public class Cabrio implements Car{
    boolean hasHeadlightsTurnedOn = false;
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return hasHeadlightsTurnedOn;
    }

    @Override
    public void turnLights(String onOrOff) {
        if (onOrOff == "off") {
            this.hasHeadlightsTurnedOn = false;
        } else if (onOrOff == "on") {
            this.hasHeadlightsTurnedOn = true;
        }else {
            System.out.println("Error. Try again");
        }

    }

    @Override
    public boolean SettingUpTheLights() {
        Random generator = new Random();
        int hours = generator.nextInt(23);


        System.out.println("It is: " + hours);
        if (hours >= 20 || hours <= 5) {
            hasHeadlightsTurnedOn = true;
            System.out.println("Lights is on");
        } else {
            hasHeadlightsTurnedOn =  false;
            System.out.println("Lights is off");
        }

        return hasHeadlightsTurnedOn;

    }

    @Override
    public String getCarType() {
        return "It is summer, the best choice is Cabrio";
    }
}
