package com.kodilla.good.patterns.challenges;

public class Item {
    private String name;
    private double price;
    private Integer quantity;

    public Item(String name, double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
