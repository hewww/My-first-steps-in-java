package com.kodilla.patterns22.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaDecoratorTestSuite {

    @Test
    public void testDecoratorPizza() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MuschroomsDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        System.out.println("Koszt pizzy to " + pizzaOrder.getCost() +"zł" + " Twoja pizza: " + pizzaOrder.getName());
        BigDecimal price = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(23),price);
    }

    @Test
    public void testDecoratorPizzaName() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MuschroomsDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //When
        System.out.println("Koszt pizzy to " + pizzaOrder.getCost() +"zł" + " Twoja pizza: " + pizzaOrder.getName());
        String  result = pizzaOrder.getName();
        //Then
        Assert.assertEquals("Basic Pizza with Cheese + Mushrooms + Salami",result);
    }


}
