package com.kodilla.notifications.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTestSuite {
    @Test
    public void shouldSendNotificationToLocationSubscribers(){
        NotificationService notificationService = new NotificationService();
        Client client = Mockito.mock(Client.class);
        Localization Warsaw = Mockito.mock(Localization.class);
        Notification notification = Mockito.mock(Notification.class);
        notificationService.addSubscribe(client);





    }
    @Test
    public void unsubscribeClientShouldNotReceiveNotificationForLocation(){


    }
    @Test
    public void unsubscribeClientShouldNotReceiveNotification(){

    }
    @Test
    public void shouldSendNotificationOnlyToClientWithSubscribe(){

    }
    @Test
    public void shouldSendNotificationToEveryOne(){

    }
    @Test
    public void deleteLocation(){

    }



}