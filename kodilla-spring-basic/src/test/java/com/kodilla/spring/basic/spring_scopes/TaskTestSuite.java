package com.kodilla.spring.basic.spring_scopes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class TaskTestSuite {
    @Test
    public void shouldCreateDifferentTasks(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.");
        Task firstBeen = context.getBean(Task.class);
        Task secondBeen = context.getBean(Task.class);
        Task thirdBeen = context.getBean(Task.class);
        Assertions.assertNotEquals(firstBeen,secondBeen);
        Assertions.assertNotEquals(secondBeen,thirdBeen);
        Assertions.assertNotEquals(firstBeen,thirdBeen);
    }


}