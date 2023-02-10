package com.kodilla.notifications.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherNotificationService {


    private Map<Location, List<Subscriber>> clientLocalizationMap = new HashMap<>();

    public void addLocation(Location location){
        clientLocalizationMap.put(location, new ArrayList<Subscriber>());
    }
    public void removeLocation(Location location){
        for (Map.Entry<Location,List<Subscriber>>entry : clientLocalizationMap.entrySet()){
            if (entry.getKey().equals(location)){
                for (Subscriber subscriber : entry.getValue()){
                    entry.getKey().removeSubscriber(subscriber);
                }
            }
        }
        clientLocalizationMap.remove(location);
    }
    public void addSubscriber(Subscriber subscriber, Location location) {
        if (clientLocalizationMap.containsKey(location)) {
            System.out.println("Location not found. Adding location to the system.");
            this.addLocation(location);
        } else {
            System.out.println("Location found.");
        }
        for (Map.Entry<Location, List<Subscriber>> entry : clientLocalizationMap.entrySet()) {
            if (entry.getKey().equals(location)) {
                entry.getValue().add(subscriber);
                entry.getKey().receiveSubscriber(subscriber);
                System.out.println("Adding subscriber " + subscriber + " to location " + location);
            }
        }
    }

    public void removeSubscriberFromLocation(Subscriber subscriber, Location location) {
        for (Map.Entry<Location, List<Subscriber>> entry : clientLocalizationMap.entrySet()) {
            if(entry.getKey().equals(location) && entry.getValue().contains(subscriber)) {
                entry.getValue().remove(subscriber);
                entry.getKey().removeSubscriber(subscriber);
                System.out.println("Removing subscriber " + subscriber + " from location " + location + ".");
            }
        }
    }

    public void removeSubscriberFromAllLocations(Subscriber subscriber) {
        for (Map.Entry<Location, List<Subscriber>> entry : clientLocalizationMap.entrySet()) {
            if(entry.getValue().contains(subscriber)) {
                entry.getValue().remove(subscriber);
                entry.getKey().removeSubscriber(subscriber);
            }
        }
        System.out.println("Removing subscriber " + subscriber + " from all followed locations.");
    }

    public void sendNotificationToLocation(WeatherNotification weatherNotification, Location location) {
        for (Map.Entry<Location, List<Subscriber>> entry : this.clientLocalizationMap.entrySet()) {
            if(entry.getKey().equals(location)) {
                entry.getValue().forEach(subscriber -> subscriber.receive(weatherNotification));
                System.out.println("Notification sent to subscribers of " + location);
            }
        }
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        for (Map.Entry<Location, List<Subscriber>> entry : this.clientLocalizationMap.entrySet()) {
            entry.getValue().forEach(subscriber -> subscriber.receive(weatherNotification));
            System.out.println("Notification sent to all.");
        }
    }

}




