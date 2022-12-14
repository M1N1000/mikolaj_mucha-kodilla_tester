package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    public String departure;
    public String arrival;

    public Flight(String departure, String arrival){
        this.arrival = arrival;
        this.departure = arrival;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }
}
