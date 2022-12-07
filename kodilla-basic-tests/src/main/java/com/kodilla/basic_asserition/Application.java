package com.kodilla.basic_asserition;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a, b);
        int minusResult = calculator.minus(a, b);
        int potegaResult = calculator.potega(6);
        boolean correct = resultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean correctMinus = resultChecker.assertEquals(-3, minusResult);
        if (correctMinus) {
            System.out.println("Metoda minus działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda minus nie działa poprawnie dla liczb " + a + " i " + b);

        }
        boolean correctPotega = resultChecker.assertEquals(36,potegaResult);
        if (correctPotega){
            System.out.println("Metoda potega działa dla liczby całkowitej");
        }else {
            System.out.println("Metoda potega nie działa dla liczby całkowitej");

        }
    }
}
