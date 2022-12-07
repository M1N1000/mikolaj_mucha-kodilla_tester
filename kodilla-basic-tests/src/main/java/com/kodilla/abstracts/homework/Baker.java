package com.kodilla.abstracts.homework;

public class Baker extends Job{
    String responsibility;

    public Baker(Person perosn) {
        super(4000, "make bread");
    }
    public String responsibility(){
        return getResponsibilities();
    }

    @Override
    public void giveResponsibility() {
        System.out.println("This is Baker responsibility: " + getResponsibilities());

    }
}
