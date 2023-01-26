package com.kodilla.mockito;

import com.kodilla.notifications.Client;
import com.kodilla.notifications.Notification;
import com.kodilla.notifications.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {
    NotificationService notificationService = new NotificationService();
    Client firstClient = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    @Test
    public void notSubscribedClientShouldNotReceiveNotification(){

        notificationService.sendNotification(notification);
        Mockito.verify(firstClient,Mockito.never()).receive(notification);
    }
    @Test
    public void subscribedClientShouldReceiveNotification(){
        notificationService.addSubscribe(firstClient);



        notificationService.sendNotification(notification);
        Mockito.verify(firstClient,Mockito.times(1)).receive(notification);


    }
    @Test
    public void notificationShouldBeSentToAllSubscribedClients(){
        addSubscribers(firstClient,secondClient);
        notificationService.sendNotification(notification);
        Mockito.verify(firstClient,Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient,Mockito.times(1)).receive(notification);


    }
    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscribe(){
      addSubscribers(firstClient,firstClient,firstClient);

        notificationService.sendNotification(notification);

        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
    }
    @Test
    public void unsubscribeClientShouldNotReceiveNotification(){
        notificationService.addSubscribe(firstClient);
        notificationService.addSubscribe(secondClient);
        notificationService.removeSubscribe(secondClient);

        notificationService.sendNotification(notification);
        Mockito.verify(firstClient,Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient,Mockito.times(0)).receive(notification);

    }
    private void addSubscribers(Client... clients) {
        for(Client currentClient : clients) {
            notificationService.addSubscribe(currentClient);

        }
    }
}
