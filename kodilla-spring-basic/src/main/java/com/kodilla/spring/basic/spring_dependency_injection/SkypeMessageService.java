package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.stereotype.Service;

@Service
public class SkypeMessageService {
    public String send(String  massage,String receiver){
        return "Sending [" + massage + "] to: " + receiver  + " using Skype";
    }
}
