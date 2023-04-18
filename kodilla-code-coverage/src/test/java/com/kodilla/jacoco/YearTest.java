package com.kodilla.jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YearTest {
    @Test
    public void shouldNotBeLeapYear(){
        //given
        Year year = new Year(2013);
        //when
        boolean isNotLeapYear = year.leapYear();
        //given
        Assertions.assertFalse(isNotLeapYear);
    }
    @Test
    public void shouldNotBeLeapYearButIsDivideBy100(){
        //given
        Year year = new Year(200);
        //when
        boolean isNotLeapYear = year.leapYear();
        //then
        Assertions.assertFalse(isNotLeapYear);

    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4(){
        //given
        Year year = new Year(16);
        //when
        boolean isLeapYearToo = year.leapYear();
        //then
        Assertions.assertTrue(isLeapYearToo);
    }

        @Test
    public void shouldBeLeapYearIfDivisibleBy400(){
        //given
        Year year = new Year(1600);
        //when
        boolean isLeapYear = year.leapYear();
        //then
        Assertions.assertTrue(isLeapYear);





    }

}