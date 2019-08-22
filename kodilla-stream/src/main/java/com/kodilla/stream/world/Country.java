package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String name;
    public final BigDecimal result;

    public Country(final String name, final BigDecimal result) {
        this.name = name;
        this.result = result;
    }

    public BigDecimal getPeopleQuantity() {
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return name.equals(country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", result=" + result +
                '}';
    }
}
