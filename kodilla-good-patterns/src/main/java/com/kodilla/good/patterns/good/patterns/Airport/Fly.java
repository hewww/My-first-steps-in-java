package com.kodilla.good.patterns.good.patterns.Airport;

import java.time.LocalDate;
import java.util.Objects;

public class Fly {
    private String from;
    private String to;
    private LocalDate date;

    public Fly(String from, String to, LocalDate date) {
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fly fly = (Fly) o;
        return from.equals(fly.from) &&
                to.equals(fly.to) &&
                date.equals(fly.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, date);
    }

    @Override
    public String toString() {
        return "Lot " +
                "Odlot " + from + '\'' +
                ",Przylot " + to + '\'' +
                ",Data " + date +
                '}';
    }

}
