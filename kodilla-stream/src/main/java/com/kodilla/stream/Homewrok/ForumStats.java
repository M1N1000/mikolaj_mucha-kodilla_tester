package com.kodilla.stream.Homewrok;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avgNumberOFPostUsersAfter40Age = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Average number Of Post by Users After 40 years old: " + avgNumberOFPostUsersAfter40Age);

        double avgNumberOFPostUsersBefore40Age = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Average number Of Post by Users Before 40 years old: "+avgNumberOFPostUsersBefore40Age);


    }
}

