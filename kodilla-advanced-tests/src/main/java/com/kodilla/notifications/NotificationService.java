package com.kodilla.notifications;

import java.util.HashSet;
import java.util.Set;

public class NotificationService {
    private Set<Client> clients = new HashSet<>();
    public void addSubscribe(Client client){
        this.clients.add(client);

    }
    public void sendNotification(Notification notification){
        this.clients.forEach(client -> client.receive(notification));

    }
    public void removeSubscribe(Client client){
        this.clients.remove(client);
    }
}
