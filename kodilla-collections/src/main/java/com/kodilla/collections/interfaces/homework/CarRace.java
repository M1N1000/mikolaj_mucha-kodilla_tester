package com.kodilla.collections.interfaces.homework;

public class CarRace  {
    public static void main(String[] args) {
        Bmw bmw = new Bmw(100);
        doRace(bmw);

        Ford ford = new Ford(80);
        doRace(ford);

        Opel opel = new Opel(70);
        doRace(opel);

    }
    private static void doRace(Car car){
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.getSpeed());
    }

}
