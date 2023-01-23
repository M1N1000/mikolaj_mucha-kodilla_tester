package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    public static List<Order> orders = new ArrayList<>();


    public void addOrder(Order order){
        this.orders.add(order);
    }
    public int getSize(){
        return this.orders.size();

    }
    public List<Order> getOrderByDataRange(LocalDate start, LocalDate end){
        return this.orders
                .stream()
                .filter(order -> order.getDate().isAfter(start)&&order.getDate().isBefore(end))
                .collect(Collectors.toList());
    }
    //public List<Order> getOrderByValue(double max, double min){
        //return this.orders
                //.stream()
               // .map(Order::getValue).min())
               // .collect(Collectors.toList());

    }






