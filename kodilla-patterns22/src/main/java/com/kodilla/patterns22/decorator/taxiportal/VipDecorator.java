package com.kodilla.patterns22.decorator.taxiportal;

import java.math.BigDecimal;

public class VipDecorator extends AbstractTaxiOrderDecorator {
    public VipDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Express Service";
    }
}

