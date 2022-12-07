package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    String job;
    public Person(String firstName,int age,String job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Person person = new Person("jake", 35,"baker");
        Baker baker = new Baker(person);
        baker.giveResponsibility();
    }

}
