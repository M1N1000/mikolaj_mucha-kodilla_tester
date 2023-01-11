package com.kodilla.exception;

import java.util.Scanner;

public class UsersDialogs {
    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of rounds: ");
            String s = scanner.nextLine();
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            } catch (Exception e) {
                System.out.println("Wrong data. Enter only digits. try again. ");
            }
        }
    }
        public static String getNumberOfOrder() {
            Scanner scanner1 = new Scanner(System.in);
            while(true){
                System.out.println("Enter number of Order: ");
                String p = scanner1.nextLine();
                try {
                    String order = String.valueOf(Integer.parseInt(p));
                    return order;
                }catch (Exception e){
                    System.out.println("Wrong data. Enter only digits. try again. ");
                }
            }
        }
    }

