package com.kodilla.collections.arrays.home;


import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCarInfo(Car car) {
        System.out.println("----------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car Speed: " + car.getSpeed());
        System.out.println("Car increase: " + car.increaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Bmw)
            return "Bmw";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car name";


    }
}


