package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    FlightFinder flightFinder = new FlightFinder();


    @Test
    public void testFindFlightFrom(){
        assertEquals(1,flightFinder.findFlightFrom("Manchester").size());
    }
    @Test
    public void testFindFlightTo(){
        assertEquals(1,flightFinder.findFlightTo("Barcelona").size());
    }

}