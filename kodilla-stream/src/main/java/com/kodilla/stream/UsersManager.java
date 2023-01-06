package com.kodilla.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UsersManager {
        public static void main(String[] args) {
            List<String> chemistGroupUsername = filterChemistGroupUsername();
            System.out.println(chemistGroupUsername);

            List<String>ageGroupUsername = filterAgeGroupUsername();
            System.out.println(ageGroupUsername);
            List<String>numberOfPostUser = filterNumberOfPostUser();
            System.out.println(numberOfPostUser);


        }

    public static List<String> filterNumberOfPostUser() {
            List<String> userNumberOfPost = UserRepository.getUserList()
                    .stream()
                    .filter(user -> user.getNumberOfPost()>100)
                    .map(UsersManager::getUsername)
                    .collect(Collectors.toList());

        return userNumberOfPost;
    }



    public static  List<String>filterChemistGroupUsername(){
            List<String> username = UserRepository.getUserList()
                    .stream()
                    .filter(user ->  user.getGroup().equals("Chemists"))
                    .map(com.kodilla.stream.UsersManager:: getUsername)
                    .collect(Collectors.toList());

            return username;
        }
        public static String getUsername(User user){
            return user.getUsername();
        }
        public static List<String> filterAgeGroupUsername(){
            List<String> username = UserRepository.getUserList()
                    .stream()
                    .filter(user -> user.getAge()>40)
                    .map(com.kodilla.stream.UsersManager :: getUsername)
                    .collect(Collectors.toList());
            return username;
        }



}

