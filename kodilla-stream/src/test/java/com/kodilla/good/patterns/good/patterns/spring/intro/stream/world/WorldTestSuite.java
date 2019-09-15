package com.kodilla.good.patterns.good.patterns.spring.intro.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();

        europe.countries.add(new Country("Poland", new BigDecimal("12000000")));
        europe.countries.add(new Country("Belgium", new BigDecimal("6000000")));
        europe.countries.add(new Country("Belarus", new BigDecimal("9000000")));
        europe.countries.add(new Country("Denmark", new BigDecimal("10500000")));
        world.continents.add(europe);

        asia.countries.add(new Country("Armenian", new BigDecimal("650000")));
        asia.countries.add(new Country("Bangladesh", new BigDecimal("153000000")));
        asia.countries.add(new Country("Chad", new BigDecimal("20000000")));
        asia.countries.add(new Country("Egypt", new BigDecimal("97000000")));
        world.continents.add(asia);

        africa.countries.add(new Country("Algeria", new BigDecimal("40000000")));
        africa.countries.add(new Country("Angola", new BigDecimal("29000000")));
        africa.countries.add(new Country("Chad", new BigDecimal("20000000")));
        africa.countries.add(new Country("Egypt", new BigDecimal("97000000")));
        world.continents.add(africa);

        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal preparedResult = new BigDecimal("494150000");

        //Then
        Assert.assertEquals(result,preparedResult);



    }
}
