package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception{

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight flightFromMilano = new Flight("Milano", "Warsaw");

        try {
            flightFinder.findFlight(flightFromMilano);
        } catch (Exception e) {
            System.out.println("Lotnisko nie jest aktualnie dostępne");
        } finally {
            System.out.println("Zakonczono dzialanie programu");
        }
    }

}
