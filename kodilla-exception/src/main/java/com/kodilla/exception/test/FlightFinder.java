package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws Exception {
        Map<String,Boolean> airports = new HashMap<>();
        airports.put("Gdynia",true);
        //airports.put("Warsaw",true);

        if(airports.containsKey(flight.getArrivalAirport())) {
            System.out.println("Airport Avaible");
        } else {
            throw new RouteNotFoundException();
        }
    }
}
