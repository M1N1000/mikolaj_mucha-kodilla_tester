package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SelectCarTestSuite {

    @Test
    public void shouldPickCar(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("choiceOfCarType");
        String carType = car.getCarType();
        System.out.println(carType);
        List<String>possibleCarType = Arrays.asList("It is Winter, the best choice is SUV","It is summer, the best choice is Cabrio","It is Autumn or Spring, the best choice is sedan");
        Assertions.assertTrue(possibleCarType.contains(carType));
    }


    }
