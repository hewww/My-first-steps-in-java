package com.kodilla.patterns22.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaDecorator {
    public SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getName() {
        return super.getName() + " + Salami";
    }
}

