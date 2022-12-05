package com.kodilla.inheritance.homework;

public class WindowsXP extends OperatingSystem {
    public WindowsXP(int release) {
        super(release);
        System.out.println("WindowsXP constructor");
    }

    @Override
    public void turnOn() {
        System.out.println("System turn on in 10 seconds");
    }
}

