package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MobilePhoneTestSuite {

    MobilePhone mobilePhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble(){
        Assertions.assertFalse(mobilePhone.needsCharging());
        Assertions.assertEquals(0.0, mobilePhone.getFreeStorage());
    }
    @Test
    public void testExpection(){
        Assertions.assertFalse(mobilePhone.needsCharging());
        Mockito.when(mobilePhone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(mobilePhone.needsCharging());
    }
    @Test
    public void shouldcallLaunchApplication(){
        mobilePhone.launchApplication("Tetris4D");
        Mockito.verify(mobilePhone).launchApplication("Tetris4D");
    }



}