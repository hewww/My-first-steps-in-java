package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public final class Calculator {

    private double val;

    @Autowired
    private Display display;


    public double add(double a , double b) {
        val = a + b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        val = a - b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        val = a * b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b) {
        val = a / b;
        display.displayValue(val);
        return val;
    }

}
