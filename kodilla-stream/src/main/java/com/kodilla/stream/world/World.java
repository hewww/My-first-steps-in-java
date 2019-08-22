package com.kodilla.stream.world;

        import java.math.BigDecimal;
        import java.util.*;
        import java.util.stream.Collectors;

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
