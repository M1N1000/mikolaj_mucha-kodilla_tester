package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();


    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(validator.isBlank(text));
    }
    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(validator.isBlank(text));
    }



}






