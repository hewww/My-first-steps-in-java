package com.kodilla.good.patterns.good.patterns.Airport;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlightFinder {
    private Fly fly;
    private FlyList flyList = new FlyList();

    public List findFlightTo(String cityTo) {
        List<Fly> flightTo = flyList.flighList().stream()
                .filter(s -> s.getTo().equals(cityTo))
                .collect(Collectors.toList());
        return flightTo;
    }

    public List findFlightFrom(String cityFrom) {
        List<Fly> flightFrom  = flyList.flighList().stream()
                .filter(s -> s.getFrom().equals(cityFrom))
                .collect(Collectors.toList());
        return flightFrom;
    }

    public void foundFlyBetween(String cityFrom, String cityTo) {
          List<String> result = flyList.flighList().stream()
                .filter(s -> s.getTo().equals(cityTo))
                  .map(s -> s.getFrom())
                  .collect(Collectors.toList());

          System.out.println("RESULT " + result.toString());

          List<Fly> flightTo = flyList.flighList().stream()
                .filter(s -> s.getTo().equals(result.get(0)))
                .collect(Collectors.toList());

          List<Fly> flightFrom  = flyList.flighList().stream()
                .filter(s -> s.getFrom().equals(result.get(0)))
                .collect(Collectors.toList());

          System.out.println(flightTo.toString());
          System.out.println(flightFrom.toString());

          boolean equlist = flightTo.containsAll(flightFrom);

          System.out.println(equlist);

//gd waw poz


//        flyList.flighList().stream()
//                .filter(s -> s.getTo().equals(result::get))
//                .forEach(System.out::println);

//        flyList.flighList().stream()
//                .filter(s -> s.getTo().equals(result))
//                .filter(s -> s.getFrom().equals(cityFrom))
//                .forEach(System.out::println);


    }
}
