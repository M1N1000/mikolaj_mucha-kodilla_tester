package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource (resources = "/intFalseGamblingMachine.csv", delimiterString = ", ")
    public void shouldInputExpected(String number ) throws InvalidNumbersException {


        Set<Integer> integerSet = new HashSet<>(Integer.parseInt(number)) ;
        assertTrue(gamblingMachine.howManyWins(integerSet)>0);

    }
}