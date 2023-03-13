package com.kodilla.notifications.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTestSuite {
    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    Subscriber subscriber = Mockito.mock(Subscriber.class);
    Location warsaw = Mockito.mock(Location.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);


    @Test
    public void notSubscriberShouldNotReceiveNotifications(){
        weatherNotificationService.addLocation(warsaw);
        weatherNotificationService.sendNotificationToLocation(weatherNotification,warsaw);
        Mockito.verify(subscriber,Mockito.never()).receive(weatherNotification);
    }
    @Test
    public void shouldAddLocation(){
        Location krakow = Mockito.mock(Location.class);
        weatherNotificationService.addLocation(krakow);
        weatherNotificationService.addSubscriber(subscriber,krakow);
        Mockito.verify(krakow,Mockito.times(1)).receiveSubscriber(subscriber);

    }
    @Test
    public void shouldAddSubscribeIfLocationIsInTheSystem(){
        weatherNotificationService.addLocation(warsaw);
        weatherNotificationService.addSubscriber(subscriber,warsaw);
        Mockito.verify(warsaw,Mockito.times(1)).receiveSubscriber(subscriber);
    }


    @Test
    public void subscriberShouldNotReceiveNotificationFromWrongLocation() {
        weatherNotificationService.addSubscriber(subscriber, warsaw);
        Location krakow = Mockito.mock(Location.class);
        weatherNotificationService.sendNotificationToLocation(weatherNotification, krakow);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherNotification);
    }


    @Test
    public void unSubscribeFromLocationShouldNotReceiveNotificationsFromLocation() {
        weatherNotificationService.addSubscriber(subscriber, warsaw);
        weatherNotificationService.removeSubscriberFromLocation(subscriber, warsaw);
        weatherNotificationService.sendNotificationToLocation(weatherNotification,warsaw);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherNotification);
    }





    @Test
    public void UnsubscribedFromAllShouldNotReceiveNotificationsToAll() {
        Location krakow = Mockito.mock(Location.class);
        weatherNotificationService.addSubscriber(subscriber, warsaw);
        weatherNotificationService.addSubscriber(subscriber, krakow);
        weatherNotificationService.removeSubscriberFromAllLocations(subscriber);
        weatherNotificationService.sendNotificationToAll(weatherNotification);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void DeleteLocation(){
        Location krakow = Mockito.mock(Location.class);
        weatherNotificationService.addSubscriber(subscriber,krakow);
        weatherNotificationService.removeLocation(krakow);
        Mockito.verify(subscriber,Mockito.never()).receive(weatherNotification);

    }



}
