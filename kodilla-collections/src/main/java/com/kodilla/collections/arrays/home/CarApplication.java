package com.kodilla.collections.arrays.home;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+1];

        for (int c = 0; c < cars.length; c++)
            cars[c] = drawnCar();
        for (Car car : cars)
            CarUtils.describeCarInfo(car);
    }

    private static Car drawnCar() {
        int drawnCarKind = random.nextInt(3);
        int a = getRandomSpeed();
        int b = getRandomIncrease();
        if (drawnCarKind == 0)
            return new Bmw(a,b);
        else if (drawnCarKind == 1)
            return new Opel(a,b);
        else {
            return new Ford(a,b);
        }

    }

    private static int getRandomSpeed(){
        return random.nextInt(150+1 - 100)+50 ;
    }
    private static int getRandomIncrease(){
        return random.nextInt(140+1 - 100)+ 20;
    }








}
