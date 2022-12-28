package com.kodilla.collections.interfaces.homework;

public class Opel implements Car
{

    private int speed;
    private int decrease;
    private int increase;


    public Opel(int speed) {
        this.speed = speed;
        this.decrease = decrease;
        this.increase = increase;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed +=20;
    }



    @Override
    public int decreaseSpeed() {
        return speed -= 50;
    }
}

