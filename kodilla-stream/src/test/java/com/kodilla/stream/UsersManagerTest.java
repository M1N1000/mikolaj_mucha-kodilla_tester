package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void tesFilterChemistsUserManager(){
        assertEquals(2,UsersManager.filterChemistGroupUsername().size());
    }
    @Test
    public void testFilterAgeUserManager(){
        assertEquals(4,UsersManager.filterAgeGroupUsername().size());
    }
    @Test
    public void testFilterNumberOFPost(){
        assertEquals(2,UsersManager.filterNumberOfPostUser().size());
    }




}