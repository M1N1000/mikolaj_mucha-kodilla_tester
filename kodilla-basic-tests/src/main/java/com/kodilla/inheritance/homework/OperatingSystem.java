package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int release;

    public OperatingSystem(int release) {
        this.release = release;
        System.out.println("System constructor");
    }

    public void turnOn() {
        System.out.println("System turn on in 20 seconds");
    }

    public void turnOff() {
        System.out.println("System turn off");
    }

    public int getRelease() {
        return release;
    }

    public void releaseYear() {
        System.out.println("Release year: " + release);
    }
}
