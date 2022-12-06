package com.kodilla.abstracts.homework;

public class  Square extends Shape{
    double side;


    public Square(double side) {
        super("Square");
        this.side = side;

    }


    public double getSide(){return side;}

    public double area(){
        return side * side;
    }
    public double circumference(){
        return side + side + side + side;
    }



    @Override
    public void giveArea() {
        System.out.println("This is square area" + area() );


    }

    @Override
    public void giveCircumference() {
        System.out.println("This is square circumference:  " + circumference());


    }
}
