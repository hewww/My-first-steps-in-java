package com.kodilla.good.patterns.good.patterns.Airport;


public class FlightFinder {
    private Fly fly;
    private FlyList flyList = new FlyList();

    public void findFlightTo(String cityTo) {
        flyList.flighList().stream()
                .filter(s -> s.getTo().equals(cityTo))
                .forEach(System.out::println);
    }

    public void findFlightFrom(String cityFrom) {
        flyList.flighList().stream()
                .filter(s -> s.getTo().equals(cityFrom))
                .forEach(System.out::println);
    }

    public void foundFlyBetween(String cityFrom, String between, String cityTo) {
        flyList.flighList().stream()
                .filter(s -> s.getFrom().equals(cityFrom))
                .filter(s -> s.getTo().equals(between))
                .forEach(System.out::println);

        flyList.flighList().stream()
                .filter(s -> s.getFrom().equals(between))
                .filter(s -> s.getTo().equals(cityTo))
                .forEach(System.out::println);
    }
}
