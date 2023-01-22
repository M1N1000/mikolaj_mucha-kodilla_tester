package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMITestSuite {
    Person person = new Person(678,876);

    static Stream<Arguments> provideDateForTestingPeople(){
         return Stream.of(
                 Arguments.of(1.84,93.1,"Overweight"),
                 Arguments.of(1.50,49.1,"Normal(Healthy weight)"),
                 Arguments.of(2.1,140.2,"Obese class I(Moderate obese)"),
                 Arguments.of(1.70,130.1,"Obese class IV(Very severely obese)"),
                 Arguments.of(1.63,58.23,"Normal(Healthy weight)")

        );

    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BMITestSuite#provideDateForTestingPeople")
    public void ShouldCalculateBmi(double height, double weight, String expected){
        assertEquals(expected, new Person(height,weight).getBMI() );
    }
}
