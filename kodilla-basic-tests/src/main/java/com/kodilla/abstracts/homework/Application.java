package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.giveArea();
        square.giveCircumference();


        Triangle triangle = new Triangle(4,2);
        triangle.giveArea();
        triangle.giveCircumference();


        Rectangle rectangle = new Rectangle(3,6);
        rectangle.giveArea();
        rectangle.giveCircumference();




    }
}
