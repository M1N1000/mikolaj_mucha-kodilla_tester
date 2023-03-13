package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AnimalFactoryTestSuite {

    @Test
    public void testCreateDog() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Dog dog = context.getBean(Dog.class);
        String voice = dog.getVoice();
        Assertions.assertEquals("Bark Bark",voice);

    }
    @Test
    public void shouldCreateDogBeanAndFetchByBeanName(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Dog dog = (Dog) context.getBean("createDog");

        String voice = dog.getVoice();
        Assertions.assertEquals("Bark Bark",voice);
    }
    @Test
    public void shouldCreateRandomAnimal(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Animal animal = (Animal) context.getBean("randomAnimal");

        String voice = animal.getVoice();
        System.out.println(voice);
       List<String>possibleVoices = Arrays.asList("Bark Bark","Meow Meow","Quack Quack");
       Assertions.assertTrue( possibleVoices.contains(voice ));
    }

}