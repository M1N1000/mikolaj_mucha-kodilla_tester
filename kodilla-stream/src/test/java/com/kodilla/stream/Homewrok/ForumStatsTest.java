package com.kodilla.stream.Homewrok;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {



    @Test
    public void testAvgAfter40(){
        assertEquals(2.25,ForumStats.avgAfter40());
    }

    @Test
    public void testAvgBefore40(){
        assertEquals(2382.0,ForumStats.avgBefore40());
    }


}