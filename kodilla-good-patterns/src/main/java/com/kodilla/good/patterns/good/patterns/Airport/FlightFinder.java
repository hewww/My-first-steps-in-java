package com.kodilla.good.patterns.good.patterns.Airport;
import java.util.stream.Collectors;

public class FlightFinder {
    private Fly fly;
    private FlyList flyList;

    public void findFlightTo(String cityTo) {
        flyList.flightList.stream()
                .map(fly -> fly.getTo())
                .filter(s -> s.contains(cityTo))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void findFlightFrom(String cityFrom) {
        flyList.flightList.stream()
                .map(fly -> fly.getFrom())
                .filter(s -> s.contains(cityFrom))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void foundFlyBetween(String cityFrom, String beetwen , String cityTo) {




    }


}
