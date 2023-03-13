package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {



    Shop shop = new Shop();
    Order one = new Order(250.90, LocalDate.now(), "Mikolaj");
    Order two = new Order(150.12, LocalDate.now(), "Filip");
    Order three = new Order(415.45, LocalDate.now(), "Natalka");
    List<Order> orders = Arrays.asList(one, two, three);
    @BeforeEach
    public void initializeInvoice() {
        shop.addOrder(one);
        shop.addOrder(two);
        shop.addOrder(three);


    }


    @Test
    public void testAddOrderAndNumberOfOrders() {
        int numberOfOrders = shop.getSize();

        assertEquals(3, numberOfOrders);
        System.out.println(shop);
    }

    @Test
    public void ShouldGetOrderFromTwoDate() {
        LocalDate a =LocalDate.of(2019,07,31)  ;
        LocalDate b = LocalDate.of(2025,07,31)  ;

        assertEquals(6,Shop.getOrderByDataRange(a,b).size());


    }
    @Test
    public void shouldGetOrderFromTwoValue(){
        assertEquals(8,Shop.getOrderMaxAndMin(100.00,300.00).size());
    }

    @Test
    public void shouldSumOrdersValue(){
        assertEquals(2449.4100000000003,Shop.getOrdersValue());
    }


}
