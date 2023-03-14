package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
@Configuration
public class SelectCar {
     private boolean hasHeadlightsTurnedOn = false;

    @Bean
    public Car choiceOfCarType() {
        Car car;
        Random generator = new Random();
        int carType = generator.nextInt(3);
        if (carType == 0) {
            car = new SUV();
        } else if (carType == 1) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;
    }

    @Bean
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

    }


