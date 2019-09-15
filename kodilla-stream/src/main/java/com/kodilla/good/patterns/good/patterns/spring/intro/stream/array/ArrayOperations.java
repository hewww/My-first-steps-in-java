package com.kodilla.good.patterns.good.patterns.spring.intro.stream.array;

import java.util.stream.IntStream;


public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.of(numbers).forEach(number -> System.out.println(number));
        IntStream streamAverage = IntStream.of(numbers);
        double average = streamAverage.average(). getAsDouble();
        return average;
    }
}