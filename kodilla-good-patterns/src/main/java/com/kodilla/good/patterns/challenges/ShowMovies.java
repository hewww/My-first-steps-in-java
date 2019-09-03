package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class ShowMovies {
    public void showMovies() {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.toList())
                .forEach(s -> System.out.print(" " + s + " " + "!"));

    }

}
