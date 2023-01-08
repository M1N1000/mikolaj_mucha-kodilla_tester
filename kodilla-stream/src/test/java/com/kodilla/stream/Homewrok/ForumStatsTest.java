package com.kodilla.stream.Homewrok;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    public static List<User> getUserList(){
        List<User> users = new ArrayList<>();
        users.add(new User("Mike",25,300,"Chemists"));
        users.add(new User("Ben",31,102,"Driver"));
        users.add(new User("Frank",45,24,"Driver"));
        users.add(new User("Scott",52,15,"Chemists"));


        return users;
    }
    double avgNumberOFPostUsersAfter40Age = ForumStatsTest.getUserList()
            .stream()
            .filter(user -> user.getAge() >= 40)
            .mapToInt(p -> p.getNumberOfPost())
            .average()
            .getAsDouble();


    double avgNumberOFPostUsersBefore40Age =ForumStatsTest.getUserList()
            .stream()
            .filter(user -> user.getAge() < 40)
            .mapToInt(p -> p.getNumberOfPost())
            .average()
            .getAsDouble();



    @Test
    public void testAvgAfter40(){
        assertEquals(19.5, avgNumberOFPostUsersAfter40Age);
    }

    @Test
    public void testAvgBefore40(){
        assertEquals(201.0,avgNumberOFPostUsersBefore40Age);
    }


}