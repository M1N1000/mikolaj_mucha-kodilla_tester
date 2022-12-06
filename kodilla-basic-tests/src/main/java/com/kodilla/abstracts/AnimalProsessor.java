package com.kodilla.abstracts;

public class AnimalProsessor {
    public void process(Animal animal){
        System.out.println("Animal has " +animal.getNumberOfLegs() + " legs");
        animal.giveVoice();
    }
}
