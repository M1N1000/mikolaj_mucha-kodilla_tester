package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Barcelona"));
        flights.add(new Flight("Barcelona", "Manchester"));
        flights.add(new Flight("Manchester", "Krakow"));
        flights.add(new Flight("New York", "Tokio"));
        flights.add(new Flight("Berlin", "Sydney"));
        return flights;
    }

}
