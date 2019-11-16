package com.kodilla.patterns22.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();

        BigDecimal calculatedPost = theOrder.getCost();

        assertEquals(new BigDecimal(5),calculatedPost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        TaxiOrder theOrder = new BasicTaxiOrder();

        String description = theOrder.getDescription();

        assertEquals("Drive a course", description);

    }

    @Test
    public void testTaxiNetworkGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        String description = taxiOrder.getDescription();

        assertEquals("Drive a course by Taxi Network" , description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        BigDecimal theCost = taxiOrder.getCost();

        assertEquals(new BigDecimal(40), theCost);
    }
}
