package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    public static List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getSize() {
        return this.orders.size();

    }

    public static List<Order> getOrderByDataRange(LocalDate start, LocalDate end) {
        return orders
                .stream()
                .filter(order -> order.getDate().isAfter(start) && order.getDate().isBefore(end))
                .collect(Collectors.toList());
    }

    public static List<Order> getOrderMaxAndMin(double min, double max) {
        return orders
                .stream()
                .filter(order -> order.getValue()>min)
                .filter(order -> order.getValue()<max)
                .collect(Collectors.toList());
    }


    public static double getOrdersValue() {
        double sum = 0;
        for (int i = 0; i < orders.size(); i++)
            sum += orders.get(i).getValue();
        return sum;
    }
}









