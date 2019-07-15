package com.kodilla.testing.calculator;

public class Calculator {
    private Integer a;
    private Integer b;
    Integer wynikAdd;
    Integer wynikMinus;

    void Calculator(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public void add(Integer a , Integer b) {
        wynikAdd = a + b;
        System.out.println("Wynik dodawania to " + wynikAdd);
    }

    public void substract(Integer a , Integer b) {
        wynikMinus = a - b;
        System.out.println("Wynik odejmowania to " + wynikMinus);
    }

    public Integer getAddResult() {
        return wynikAdd;
    }

    public Integer getMinusResult() {
        return wynikMinus;
    }
}
