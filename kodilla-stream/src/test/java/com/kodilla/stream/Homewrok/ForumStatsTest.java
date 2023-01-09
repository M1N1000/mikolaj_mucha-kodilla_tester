package com.kodilla.stream.Homewrok;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    public static List<User> getUserList(){
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Mike",25,300,"Chemists"));
        testUsers.add(new User("Ben",31,102,"Driver"));
        testUsers.add(new User("Frank",45,24,"Driver"));
        testUsers.add(new User("Scott",52,15,"Chemists"));


        return getUserList();
    }



    @Test
    public void testAvgAfter40(){
        assertEquals(19.5,ForumStats.avgAfter40());
    }

    @Test
    public void testAvgBefore40(){
        assertEquals(201.0,ForumStats.avgBefore40());
    }


}