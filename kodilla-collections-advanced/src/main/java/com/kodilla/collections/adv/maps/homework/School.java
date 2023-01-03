package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Integer> numberStudentsOfSchool = new ArrayList<>();


    public School(List<Integer> numberStudentsOfSchool ) {
        this.numberStudentsOfSchool = numberStudentsOfSchool;

    }

    public int getSumOfStudents(){
        int sum  = 0;
        for(int numberStudentOfClass : numberStudentsOfSchool)
            sum += numberStudentOfClass;
        return sum;
    }


    @Override
    public String toString() {
        return "School{" +
                "numberStudentsOfClass=" + numberStudentsOfSchool +
                '}';
    }
}
