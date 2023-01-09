package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Warehouse {
    private List<Order> addOrder(){
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1"));
        orders.add(new Order("2"));
        orders.add(new Order("3"));
        orders.add(new Order("4"));
        return orders;
    }
   // public Order getOrder(String number)
}
