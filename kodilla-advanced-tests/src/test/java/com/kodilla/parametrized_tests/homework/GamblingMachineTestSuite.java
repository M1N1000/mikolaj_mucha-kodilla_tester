package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvSource( value = {"1:2:3:4:5:6:7"},delimiter = ':')
    public void shouldInputExpected(Integer number, String expected) throws InvalidNumbersException {
        assertEquals(expected,gamblingMachine.howManyWins(Collections.singleton((number))));


    }
}