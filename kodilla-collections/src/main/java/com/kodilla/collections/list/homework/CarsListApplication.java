package com.kodilla.collections.list.homework;

import com.kodilla.collections.arrays.home.CarUtils;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(50, 30);
        cars.add(ford);
        cars.add(new Opel(40, 20));
        cars.add(new Bmw(60, 40));

        cars.remove(1);
        cars.remove(ford);


        System.out.println(cars.size());


        for (Car car : cars) {
            if (car.getSpeed() >= 40)
                CarUtils.describeCarInfo(car);
        }

    }
}
