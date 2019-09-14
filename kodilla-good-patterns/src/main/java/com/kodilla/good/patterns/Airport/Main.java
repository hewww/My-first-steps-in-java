package com.kodilla.good.patterns.Airport;

public class Main {
    public static void main(String[] args) {

        FlyList flyList = new FlyList();
        flyList.flightList();

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightTo("Warszawa");

    }
}
