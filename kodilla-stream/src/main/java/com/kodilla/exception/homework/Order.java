package com.kodilla.exception.homework;

import java.util.Scanner;

public class Order {
    private String number;


    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of Order: ");
            String p = scanner1.nextLine();
            try {
                String number = String.valueOf(Integer.parseInt(p));
                return number;
            } catch (Exception e) {
                System.out.println("Wrong data. Enter only digits. try again. ");

            }

            return number;
        }
    }
}



