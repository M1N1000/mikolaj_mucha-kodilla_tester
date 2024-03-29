package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public Calculator(Display display){
        this.display = display;
    }


    public double add(double a , double b){
        double sum = a + b ;
        this.display.display(sum);
        return sum;
    }
    public double subtract(double a, double b){
        double sum = a - b;
        this.display.display(sum);
        return sum;
    }
    public double multiply(double a,double b){
        double sum =  a*b;
        this.display.display(sum);
        return sum;
    }
    public double divide(double a, double b) throws DivideByZero {
        double sum = a/b;
        this.display.display(sum);
        return sum;
    }

}
