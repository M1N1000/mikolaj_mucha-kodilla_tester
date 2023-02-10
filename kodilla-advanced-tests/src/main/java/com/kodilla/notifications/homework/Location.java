package com.kodilla.notifications.homework;

public interface Location {
    void receiveSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);

}
