package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    Map<String, List<Flight>> flightFinder = new HashMap<>();




    public List<Flight> findFlightFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable())
            if (flight.getDeparture().equals(departure))
                result.add(flight);
        return result;
    }


    public List<Flight> findFlightTo(String arrival){
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable())
            if (flight.getArrival().equals(arrival))
                result.add(flight);
        return result;
    }
    public int size(){
        return flightFinder.size();
    }
}
