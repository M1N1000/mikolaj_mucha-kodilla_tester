package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.springframework.stereotype.Service;

@Service
public class ShippingCenter {
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }


        public String sendPackage(String address,double weight){
            if (deliveryService.deliverPackage(address, weight)) {
                return notificationService.success(address);
            } else
                return notificationService.fail(address);


        }
    }


