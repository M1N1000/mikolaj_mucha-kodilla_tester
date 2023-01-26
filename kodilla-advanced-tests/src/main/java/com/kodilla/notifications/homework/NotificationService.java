package com.kodilla.notifications.homework;

import com.kodilla.notifications.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationService {

    private Set<Client> clients = new HashSet<>();
    private Map<Notification, Localization> notificationLocalizationMap = new HashMap<>();

    public void addSubscribe(Client client ){
        this.clients.add(client);
    }


    }







