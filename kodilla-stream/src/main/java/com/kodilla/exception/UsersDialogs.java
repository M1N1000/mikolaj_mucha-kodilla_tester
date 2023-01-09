package com.kodilla.exception;

import java.util.Scanner;

public class UsersDialogs {
    public static int getNumberOfRounds(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number od rounds: ");
            String s = scanner.nextLine();
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            }catch (Exception e){
                System.out.println("Wrong data. Enter only digits. try again. ");
            }
        }
    }
}
