package com.kodilla.exception.homework;

import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of Order");
            String number = scanner.nextLine();
            try {
                Order order =warehouse.getOrder(String.valueOf(Integer.parseInt(number)));
                System.out.println("Your order: " + number);

            } catch (Exception e) {
                System.out.println("Wrong number, try again");
            }

            }


            }

        }


