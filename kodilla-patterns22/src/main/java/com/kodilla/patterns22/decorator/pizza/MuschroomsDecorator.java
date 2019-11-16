package com.kodilla.patterns22.decorator.pizza;

import com.kodilla.patterns22.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class MuschroomsDecorator extends AbstractPizzaDecorator {
    public MuschroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getName() {
        return super.getName() + " + Mushrooms";
    }
}

