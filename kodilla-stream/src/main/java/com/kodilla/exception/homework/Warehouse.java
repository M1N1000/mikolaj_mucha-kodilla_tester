package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orders;

    public Warehouse(){
        this.orders = new ArrayList<>();
    }
    public void  addOrder(Order order){
        orders.add(order);

    }
    public Order getOrder(String number)throws OrderDoesntExistException{
        Order search = orders
                .stream()
                .filter(f -> f.getNumber().equals(number))
                .findFirst().orElseThrow(() -> new OrderDoesntExistException());

        return search;


    }

}
