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
        Baker baker = new Baker();
        Person person = new Person("Jake",35,baker);
        baker.giveResponsibility();


        Job builder = new Builder();
        Person person1 = new Person("Duke",45,builder);
        builder.giveResponsibility();



    }

}
