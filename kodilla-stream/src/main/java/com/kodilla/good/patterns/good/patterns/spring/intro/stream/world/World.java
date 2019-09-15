package com.kodilla.good.patterns.good.patterns.spring.intro.stream.world;

        import java.math.BigDecimal;
        import java.util.*;

public class World {
    public final Set<Continent> continents = new HashSet<>();



    public final BigDecimal getPeopleQuantity() {

        final BigDecimal reduce = continents.stream()
                .flatMap(continent -> continent.countries.stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return reduce;
    }





}
