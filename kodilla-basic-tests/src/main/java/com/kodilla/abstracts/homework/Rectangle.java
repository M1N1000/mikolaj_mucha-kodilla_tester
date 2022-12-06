package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    double shortSide;
    double longSide;
    public Rectangle(double shortSide,double longSide) {
        super("rectangle");
        this.longSide = longSide;
        this.shortSide = shortSide;
    }
    public double getShortSide(){
        return shortSide;
    }
    public double getLongSide(){
        return shortSide;
    }
    public double area(){
        return shortSide * longSide;
    }
    public double circumference(){
        return 2*shortSide + 2*longSide;
    }

    @Override
    public void giveArea() {
        System.out.println("this is rectangle area: " + area());

    }

    @Override
    public void giveCircumference() {
        System.out.println("this is rectangle circumference: " + circumference());

    }
}
