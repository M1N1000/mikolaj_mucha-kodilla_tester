package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.Optional;

public class Student {
    String name;
    Teacher teacher;

    public Student(String name,Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
    public String getName() {
        return name;
    }

    public Teacher getTeacher() {

       return Optional.ofNullable(teacher).orElse(new Teacher("<undefined>"));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
