package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DhlDeliverService implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
            if (weight > 30) {
                return false;
            }
            return true;
        }
    }

