package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add( new Student("Mark", new Teacher("Piter")));
        students.add( new Student("John",null));
        students.add( new Student("Justin",new Teacher ("Artur")));





        for (Student student: students) {
            System.out.println("Uczeń: " + student.getName() +" Nauczyciel: "+student.getTeacher().getName());
            
        }
    }
}

