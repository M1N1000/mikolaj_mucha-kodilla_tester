package com.kodilla.inheritance.homework;

public class Windows98 extends OperatingSystem {
    public Windows98(int release) {
        super(release);
        System.out.println("Windows98 constructor");
    }

    @Override
    public void turnOn() {
        System.out.println("System turn on in 15 seconds");
    }
}
