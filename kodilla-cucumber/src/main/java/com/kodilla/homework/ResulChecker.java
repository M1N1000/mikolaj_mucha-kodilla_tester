package com.kodilla.homework;

public class ResulChecker {
    private int result;


    public static String divideByNumber(int number) {
        int a = 3;
        int b = 5;

        if (number % a == 0 && number % b == 0) {
            return "FizzBuzz";
        } else if (number % b == 0) {
            return "Buzz";
        } else if (number % a == 0) {
            return "Fizz";
        } else
            return "None";
    }
}


