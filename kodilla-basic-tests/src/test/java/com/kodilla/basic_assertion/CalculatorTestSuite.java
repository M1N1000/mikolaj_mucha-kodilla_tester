package com.kodilla.basic_assertion;

import com.kodilla.basic_asserition.Calculator;
import com.kodilla.basic_asserition.resultChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {


    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double sumResult = calculator.add(a,b);
        double deltaAdd = calculator.add(a,b);
        assertEquals(11.40, sumResult, 0.01);

    }

    @Test
    public void testMinus() {
        Calculator calculator1 = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double minusResult = calculator1.minus(a, b);
        double minusDelta = calculator1.minus(a,b);
        assertEquals(-0.2, minusResult, 0.01);
    }

    @Test
    public void testPotega() {
        Calculator calculator2 = new Calculator();
        double a = -2;
        double b = 8;
        double potegaResult = calculator2.potega(a);
        double potegaDelta = calculator2.potega(a);
        assertEquals(4, potegaResult,0.01 );
    }
}

