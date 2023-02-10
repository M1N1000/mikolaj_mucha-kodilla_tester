package com.kodilla.notifications;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NotificationServiceTestSuite {
    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        notificationService.addSubscribe(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        addSubscribers(client, secondClient, thirdClient);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
        Mockito.verify(secondClient).receive(notification);
        Mockito.verify(thirdClient).receive(notification);
    }


    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        addSubscribers(client, client, client);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        notificationService.addSubscribe(client);
        notificationService.removeSubscribe(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    private void addSubscribers(Client... clients) {
        for(Client currentClient : clients) {
            notificationService.addSubscribe(currentClient);
        }
    }

}
