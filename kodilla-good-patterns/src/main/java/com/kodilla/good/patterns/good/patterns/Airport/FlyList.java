package com.kodilla.good.patterns.good.patterns.Airport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlyList {

    public List<Fly> flightList = new ArrayList<>();

    public List<Fly> flighList() {


        Fly fly = new Fly("Gdańsk", "Warszawa", LocalDate.of(2019, 12, 10));
        Fly fly2 = new Fly("Warszawa", "Poznan", LocalDate.of(2019, 12, 11));
        Fly fly3 = new Fly("Poznan", "Gdańsk", LocalDate.of(2019, 12, 13));

        flightList.add(fly);
        flightList.add(fly2);
        flightList.add(fly3);

        return flightList;
    }
}
