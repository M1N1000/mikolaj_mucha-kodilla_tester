package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School>city = new HashMap<>();
        Principal brad = new Principal("Brad", "Pitt","1Lo");
        Principal jacek = new Principal("Jacek", "Cygan","2Lo");
        Principal dawid = new Principal("Dawid", "Podsiadło","3lo");
        Principal daria = new Principal("Daria", "Zawiało","4Lo");


         School bradSchool = new School(Arrays.asList(31,28,35))  ;
        School jacekSchool = new School(Arrays.asList(32,25,18,52))  ;
        School dawidSchool = new School(Arrays.asList(30,14,34,29,27))  ;
        School dariaSchool = new School(Arrays.asList(19,14))  ;


         city.put(brad,bradSchool);
        city.put(jacek,jacekSchool);
        city.put(dawid,dawidSchool);
        city.put(daria,dariaSchool);



        for (Map.Entry<Principal,School>principalEntry:city.entrySet() )
            System.out.println("Principal: " + principalEntry.getKey().getFirstname() +" "+ principalEntry.getKey().getLastname()
                    +" School: " + principalEntry.getKey().getSchoolName() +
                    " Sum of Student: " + principalEntry.getValue().getSumOfStudents());

        }

    }

