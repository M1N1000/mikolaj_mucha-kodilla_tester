package com.kodilla.selenium.pom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class kodillaLoginPomTest {
    kodillaLoginPom loginPom;

    @BeforeEach
    public void testSetup(){
        loginPom = new kodillaLoginPom();

    }
    //@AfterEach
    public void testDawn(){
        loginPom.close();

    }
    @Test
    public void testLoginPage_CheckErrorValidation(){
        String email = "blednyemail@gmail.com";
        String password = "bledneHaslo";
        boolean logggedIn = loginPom.login(email,password);
        Assertions.assertFalse(logggedIn);

    }
    @Test
    public void testLoginPage_checkPositiveValidation(){
        String email = "test@kodilla.com";
        String password = "kodilla123";
        boolean logggedIn1 = loginPom.login(email,password);
        Assertions.assertTrue( logggedIn1);

    }

}