package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
@SpringBootTest
public class ClockTestSuite {
    @Test
    public void ShouldCreateTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.");
        Clock firstBean = (Clock) context.getBean("clock",LocalTime.now());
        Clock secondBean = (Clock) context.getBean("clock",LocalTime.now());
        Clock thirdBean =(Clock) context.getBean("clock",LocalTime.now());
        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(thirdBean, secondBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
    }
}

