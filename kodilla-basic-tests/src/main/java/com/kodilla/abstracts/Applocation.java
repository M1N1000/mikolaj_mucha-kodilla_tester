package com.kodilla.abstracts;

public class Applocation {
    public static void main(String[] args) {
        Animal dog = new Dog();

        AnimalProsessor prosessor = new AnimalProsessor();
        prosessor.process(dog);
    }
}
