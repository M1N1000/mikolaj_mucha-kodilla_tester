package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {
    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"test.test@test.test","tEsT123.tEST76@test.test"})
    public void testEmailValidatorTrue(String email){
        assertTrue(validator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"test.test.test.test","Test.Test@test"})
    public void testEmailValidatorFalse(String email){
        assertFalse(validator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"as","!@#$%^%^&&**",})
    public void testUsernameValidatorFalse(String username){
        assertFalse(validator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource(strings = {"kodilla","kodilla123","123Kodilla123"})
    public void testUsernameValidatorTrue(String username){
        assertTrue(validator.validateUsername(username));
    }
}