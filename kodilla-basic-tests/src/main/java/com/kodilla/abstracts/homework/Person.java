package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;



    public Person(String firstName,int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public static void main(String[] args) {
        Job baker = new Baker();
        baker.giveResponsibility();

        Job builder = new Builder();
        builder.giveResponsibility();



    }

}
