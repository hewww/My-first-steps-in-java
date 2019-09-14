package com.kodilla.good.patterns.Airport;

import java.time.LocalDate;

public class FlightsImpl {
    private FlyList flyList;

    public void addFlights() {
        Fly fly = new Fly("Gdańsk","Warszawa", LocalDate.of(2019,12,10));
        Fly fly2 = new Fly("Warszawa","Poznan", LocalDate.of(2019,12,11));
        Fly fly3 = new Fly("Poznan","Gdańsk", LocalDate.of(2019,12,13));

        flyList.flightList.add(fly);
        flyList.flightList.add(fly2);
        flyList.flightList.add(fly3);
    }
}
