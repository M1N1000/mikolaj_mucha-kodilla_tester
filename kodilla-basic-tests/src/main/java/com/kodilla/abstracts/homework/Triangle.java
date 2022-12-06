package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    double side;
    double high;


    public Triangle(double side,double high) {
        super("Triangle");
        this.side = side;
        this.high = high;
    }
    public double getSide(){return side;}

    public double getHigh() {
        return high;
    }

    public double area(){
        return  (side * high *0.5);
    }
    public double circumference(){
        return side + side + side;
    }

    @Override
    public void giveArea() {
        System.out.println("This is triangle area: " + area());

    }

    @Override
    public void giveCircumference() {
        System.out.println("This is triangle circumference" + circumference());

    }
}
