package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public final class Display {
    public void displayValue(double val) {
        System.out.println("Wynik twojej operacji to " + val);
    }
}
