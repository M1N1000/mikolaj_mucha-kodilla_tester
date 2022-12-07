package com.kodilla.abstracts.homework;

public class Builder extends  Job{
    public Builder() {
        super(3000, "build a house");
    }

    public String responsibility(){
        return getResponsibilities();
    }
    @Override
    public void giveResponsibility() {
        System.out.println("This is Builder responsibility: " + getResponsibilities());


    }
}
