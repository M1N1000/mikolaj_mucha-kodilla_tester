package com.kodilla.exception.homework;

import com.kodilla.exception.UsersDialogs;

public class WarehouseApp{
    public static void main(String[] args) throws OrderDoesntExistException{
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        
        warehouse.getOrder("37");



    }
}
