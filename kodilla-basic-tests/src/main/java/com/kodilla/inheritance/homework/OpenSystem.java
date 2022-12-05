package com.kodilla.inheritance.homework;

public class OpenSystem {
    public static void main(String[] args){
        OperatingSystem operatingSystem = new OperatingSystem(1990);
        operatingSystem.getRelease();
        operatingSystem.turnOn();


        Windows98 windows98 = new Windows98(1998);
        windows98.releaseYear();
        windows98.turnOn();

        WindowsXP windowsXP = new WindowsXP(2001);
        windowsXP.releaseYear();
        windowsXP.turnOn();

    }
}
