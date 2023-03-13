package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootTest
public class CalculatorTestSuite {


        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double a = 3.22;
        double b = 12.58;
        double c = 0.00;

        @Test
        public void shouldAdd(){
            double result = bean.add(a,b);
            Assertions.assertEquals(15.8,result,0.01);
    }
    @Test
    public void shouldSubtract(){
            double result = bean.subtract(a,b);
            Assertions.assertEquals(-9.36,result,0.01);
    }
    @Test
    public void shouldMultiply(){
            double result = bean.multiply(a,b);
            Assertions.assertEquals(40.50,result,0.01);
    }
    @Test
    public void shouldDivide() throws DivideByZero{
            double result = bean.divide(a,b);
            Assertions.assertEquals(0.25,result,0.01);
    }
    @Test
    public void shouldNotDivide()throws DivideByZero{
            double result = bean.divide(a,c);
            Assertions.assertNotNull(result);
    }

}